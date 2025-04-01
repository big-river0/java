import java.util.Scanner;

public class InputNum1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("숫자1를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("숫자2를 입력하세요: ");
        num2 = sc.nextInt();

        System.out.println(num1 + num2);
        }
    }
