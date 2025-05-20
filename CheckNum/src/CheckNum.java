import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num <= 100 && num >= 0) {
                System.out.println("입력한 숫자: " + num);
                break;
            }
            System.out.println("다시 입력하세요");
        }
    }
}
