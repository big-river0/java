import java.util.Scanner;

public class SumCalcul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (num >= 0) {
            sum += num;
            System.out.println("점수를 입력하세요 (종료하려면 음수를 입력): ");
            num = sc.nextInt();
        }
        System.out.println("점수의 총합은:" + sum);
    }
}

