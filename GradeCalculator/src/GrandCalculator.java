import java.util.Scanner;

public class GrandCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.println("점수를 입력하세요: ");
        score = sc.nextInt();

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score >= 0) {
            grade = "F";
        } else {
            grade = "Error";
        }
        System.out.println("학점: " + grade);
        sc.close();
    }
}

