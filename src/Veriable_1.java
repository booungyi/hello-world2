public class Veriable_1 {
    //241111
    public static void main(String[] args) {

        int var = 20;
        var = 25;
        String 이름 = "박효신";
        String 국적 = "대한민국";
        String 생년월일 = "011003";
        int 키 = 178;
        int 몸무게 = 65;
        boolean 군필 = true;

        System.out.println("이름 : " + 이름);
        System.out.println("국적: " + 국적);
        System.out.println("키: "+ 키);
        System.out.println("몸무게 = " + 몸무게);
        System.out.println("생년월일 = " + 생년월일);
        System.out.println("군필 = " + 군필);

        System.out.println("10-1" + "10-10");

        String 제목 = "범죄도시 1";
        String 개봉일 = "2017.10.23";
        
        int price = 100;
        int totalPrice = price;
        System.out.println("price = " + price);
        System.out.println("totalPrice = " + totalPrice);

        price = 200;
        System.out.println("price = " + price);
        System.out.println("totalPrice = " + totalPrice);


        int 연봉 = 5400;
        int 월급 = 연봉 / 13;
        System.out.println("월급 = " + 월급);
        // 아래에 코드 한 줄 추가
        월급 = 연봉 / 12;
        System.out.println("월급 = " + 월급);

        int 상품구매수량 = 1;
        상품구매수량 = 상품구매수량 + 1;
        //아래에 코드 여러줄 추가
        상품구매수량 = 상품구매수량 + 1;
        상품구매수량 = 상품구매수량 + 1;
        상품구매수량 = 상품구매수량 + 1;
        System.out.println("상품구매수량 = " + 상품구매수량);

        // 상품 구매 시 총 구매 금액 구하기
        int 상품금액 = 1000;
        int 구매수량 = 3;
        int 총구매금액 = 상품금액 * 구매수량;
        System.out.println("총구매금액 = " + 총구매금액);
        
        //나이 구하기
        int 생년 = 2000;
        int 올해 = 2024;
        int age = 올해 - 생년;
        System.out.println("age = " + age);

    }
}
