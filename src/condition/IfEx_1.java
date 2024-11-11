package condition;

import java.util.Scanner;

public class IfEx_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 변수 isSchoolZone에 입력된 데이터가 true이면 "어린이보호구역"을 출력한다.
        System.out.print("어린이보호구역인가요?(true/false): ");
        boolean isSchoolZone = scanner.nextBoolean();
        // 아래에 코드 작성
        if (isSchoolZone) {
            System.out.println("어린이보호구역");
        } else {
            System.out.println("어린이보호구역이 아닙니다");
        }

        //speed가 50보다 크면 "과속"을 출력한다.
        System.out.print("속도를 입력하세요: ");
        int speed = scanner.nextInt();
        //아래에 코드 작성
        if (speed >=50) {
            System.out.println("과속");
        }
            //
            // age가 0보다 작으면 "잘못된 나이 입력"을 출력한다.
            // age가 19보다 작으면 "미성년자"를 출력한다.
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            // 아래에 코드 작성
            if (age <= 0) {
                System.out.println("잘못된 나이 입력");
            }
            if (age < 19) {
                System.out.println("미성년자");
            }
        // light가 r(red)이면 "정지"를 출력한다.
        // light가 y(yellow)이면 "감속"을 출력한다.
        // light가 g(green)이면 "주행"을 출력한다.
        System.out.print("신호등 색깔을 입력하세요(r/y/g): ");
        char light = scanner.next().charAt(0);
        // 아래에 코드 작성
        if (light == 'r') {
            System.out.println("정지");
        }
        if (light == 'y') {
            System.out.println("감속");
        }
        if (light == 'g') {
            System.out.println("주행");
        }
        // n이 짝수이면 "짝수"를 출력한다.
        // n이 홀수가 아니면 "짝수"를 출력한다.
        // n이 7의 배수이면 "7의 배수"를 출력한다.
        System.out.print("정수를 입력하세요: ");
        int n = scanner.nextInt();
        boolean odd = (n % 2) == 0;

        // 아래에 코드 작성
        if (odd) {
            System.out.println("짝수");
        }
        if (!odd) {
            System.out.println("홀수");
        }
        // totalAmount(총 구매 금액)이 20000보다 크면 shipping(배송비)를 0으로 한다.
        System.out.print("총 구매 금액을 입력하세요: ");
        int totalAmount = scanner.nextInt();
        int shipping = 3000;
        // 아래에 코드 작성
        if (totalAmount > 20000) {
            shipping = 0;
        }
        System.out.println("배송비: " + shipping);

        // quantity(주문 수량)에 따라 stock(재고)를 감소시킨다. 단, 재고가 음수가 되면 안 된다.
        System.out.print("주문 수량: ");
        int quantity = scanner.nextInt();
        int stock = 3;

        // 아래에 코드 작성
        if (quantity > stock) {
            System.out.println("error");
        }
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println("재고: " + stock);
        }
        // KTX 환불 위약금을 계산한다: 출발 전 승차권 요금의 5%, 출발 후 환불 불가

        System.out.print("열차가 출발했나요?(true/false): ");
        boolean hasDeparted = scanner.nextBoolean();

        int fare = 50000;
        // 아래에 코드 작성
        if (!hasDeparted) {
            fare = (int) (fare * 0.05);
            System.out.println("환불 위약금: " + fare);
        }
        if (hasDeparted) {
            System.out.println("환불 안되용");
        }
        // 택배 배송일 계산

        // weekend가 true이면 배송일에 2일 추가
        System.out.print("주말 주문인가요?(true/false): ");
        boolean weekend = scanner.nextBoolean();

        // weight가 3kg 이상이면 배송일 1일 추가
        System.out.print("무게를 입력하세요(kg): ");
        double weight = scanner.nextDouble();

        // 배송지가 제주도면 배송일 2일 추가
        System.out.print("배송지가 제주도인가요?(true/false): ");
        boolean isJeju = scanner.nextBoolean();
        int deliveryDays = 3; // 기본 배송일

        // 아래에 코드 작성
        if (weekend) {
            deliveryDays += 2;
        }
        if (weight >= 3) {
            deliveryDays += 1;
        }
        if (isJeju) {
            deliveryDays += 2;
        }
        System.out.println("배송까지 : " + deliveryDays + " 일");
        }
    }