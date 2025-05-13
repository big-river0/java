import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class Assignment {
    String title;
    LocalDate deadline;
    boolean notifiedD3 = false;
    boolean notifiedD1 = false;
    boolean notifiedD0 = false;

    public Assignment(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
    }
}

public class Main {
    static List<Assignment> assignments = new ArrayList<>();

    public static void main(String[] args) {
        // 테스트용 과제 추가
        assignments.add(new Assignment("자료구조 과제", LocalDate.now().plusDays(3)));
        assignments.add(new Assignment("캡스톤 보고서", LocalDate.now().plusDays(1)));
        assignments.add(new Assignment("네트워크 퀴즈", LocalDate.now()));

        // 10초마다 검사 (실제는 1시간 정도 간격 추천)
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                checkDeadlines();
            }
        }, 0, 10000); // 10000ms = 10초
    }

    static void checkDeadlines() {
        LocalDate today = LocalDate.now();
        for (Assignment a : assignments) {
            long daysLeft = ChronoUnit.DAYS.between(today, a.deadline);

            if (daysLeft == 3 && !a.notifiedD3) {
                System.out.println("[3일 전 알림] '" + a.title + "' 제출까지 3일 남았습니다.");
                a.notifiedD3 = true;
            } else if (daysLeft == 1 && !a.notifiedD1) {
                System.out.println("[1일 전 알림] '" + a.title + "' 제출은 내일입니다.");
                a.notifiedD1 = true;
            } else if (daysLeft == 0 && !a.notifiedD0) {
                System.out.println("[마감 당일!] '" + a.title + "' 오늘이 마감일입니다!");
                a.notifiedD0 = true;
            }
        }
    }
}
