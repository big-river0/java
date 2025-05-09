import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력:");
        int score = scanner.nextInt();

        String grade = "";

        switch (score / 10) {
            case 10, 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5,4,3,2,1,0:
                grade = "F";
                break;
            default:
                System.out.println("잘못된 점수입니다.");
                return;
        }
        System.out.println("학점:" + grade);
    }
}