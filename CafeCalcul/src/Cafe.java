import java.util.Scanner;
public class Cafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int type = scanner.nextInt();

        int price = 0;

        switch (type) {
            case 1:
                price += 3000;
                break;
            case 2:
                price += 4000;
                break;
            case 3:
                price += 4500;
                break;
            default:
                System.out.println("잘못된 음료 선택입니다.");
                return;
        }


        System.out.println("크기를 선택하세요: 1-small, 2-medium, 3-large");
        int size = scanner.nextInt();

        switch (size) {
            case 1:
                price += 0;
                break;
            case 2:
                price += 500;
                break;
            case 3:
                price += 1000;
                break;
            default:
                System.out.println("잘못된 크기 선택입니다.");
                return;
        }


        System.out.println("옵션를 선택하세요: 1-기본, 2-샷, 3-시럽, 4-샷, 시럽");
        int ops = scanner.nextInt();

        switch (ops) {
            case 1:
                price += 0;
                break;
            case 2:
                price += 500;
                break;
            case 3:
                price += 300;
                break;
            case 4:
                price += 800;
                break;
            default:
                System.out.println("잘못된 옵션 선택입니다.");
                return;
        }

        System.out.println("최종 가격은 " + price);
    }
}