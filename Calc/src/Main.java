import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        String cal;
        System.out.print("숫자1를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("숫자2를 입력하세요: ");
        num2 = sc.nextInt();
        System.out.print("숫자3를 입력하세요: ");
        num3 = sc.nextInt();

        System.out.println(num1 - num3 - num2);
    }
}