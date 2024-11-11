package condition;

import java.util.Scanner;

public class IfEx_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // age가 19보다 작으면 "미성년자"를, 아니면 "성인"을 출력한다.
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        // 아래에 코드 작성
        if (age < 19) {
            System.out.println("미성년자");

        } else {
            System.out.println("성인");
        }


        // n이 0보다 작으면 "음수"를, 아니면 "0 또는 양수"를 출력한다.
        System.out.print("정수를 입력하세요: ");
        int n1 = scanner.nextInt();
        // 아래에 코드 작성
        if (n1 < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0 또는 양수");
        }


        // n이 짝수이면 "짝수"를, 아니면 "홀수"를 출력한다.
        System.out.print("정수를 입력하세요: ");
        int n2 = scanner.nextInt();
        // 아래에 코드 작성
        if (n2 % 2 == 1) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // totalAmount가 20000보다 크면 "무료 배송"을, 아니면 "유료 배송"을 출력한다.
        System.out.print("총 구매 금액을 입력하세요: ");
        int totalAmount = scanner.nextInt();
        // 아래에 코드 작성
        if (totalAmount > 20000) {
            System.out.println("무료 배송");
        } else {
            System.out.println("유료 배송");
        }
    }
}
