import java.util.Scanner;

public class ScoreInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요: ");
        int stunum = sc.nextInt();
        System.out.println("과목 수를 입력하세요: ");
        int subnum = sc.nextInt();
        int[][] scores = new int[stunum][subnum];
        for (int i = 0; i < stunum; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subnum; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[i][j] = sc.nextInt();
            }
        }
        System.out.println("--- 성적표 ---");
        for (int i = 0; i < stunum; i++) {
            System.out.println((i+1) + "번 학생:");
            for (int j = 0; j < subnum; j++) {
                System.out.println(scores[i][j]);
            }
        }
    }
}