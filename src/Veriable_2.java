public class Veriable_2 {
    public static void main(String[] args) {

        //할인해 주기
        double 할인율 = 0.1;
        int 총구매금액 = 3000;
        총구매금액 = (int) (총구매금액 * (1 - 할인율)); //10%할인 (-300)
        System.out.println("총구매금액 = " + 총구매금액);

        int 나이 = 20;
        //이 아래에 코드 입력
        나이 = 나이 + 1;
        System.out.println("나이 = " + 나이);

        int count = 5;
        // 아래에 코드 여러 줄 추가
        count = count - 1;
        count = count - 1;
        count = count - 1;
        count = count - 1;
        count = count - 1;
        System.out.println("count = " + count);


    }
}
