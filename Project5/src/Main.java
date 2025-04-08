import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = 90;
        int mat = 90;
        int eng = 90;
        int sci = 90;
        int sum = 90;
        int intAvg = 0;
        double doubleAvg = 0.0;
        boolean boolRsit = false;
        System.out.println("점수를 입력하세요 \n국어 :");
        kor = sc.nextInt();
        System.out.println("수학: ");
        mat = sc.nextInt();
        System.out.println("영어: ");
        eng = sc.nextInt();
        System.out.println("과학: ");
        sci = sc.nextInt();
        sum = kor + mat + eng + sci + sum;
        intAvg = sum / 4;
        doubleAvg = sum / 4;
        boolRsit = intAvg == doubleAvg;
        System.out.println("총점: " + sum);
        System.out.println("정수 평균: : " + intAvg);
        System.out.println("실수 평균: " + doubleAvg);
        System.out.println("정수 평균 = 실수 평균?: " + boolRsit);

    }
}