import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("숫자를 입력하세요: ");
        int max_num = sc.nextInt();
        if (max_num < 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        for (int i = 1; i <= max_num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("홀수의 합:" + sum);
    }
}
