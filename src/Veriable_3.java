import java.time.LocalDate;

public class Veriable_3 {

    public static void main(String[] args) {
        //변수 값 부호 바꾸기
        //양수 ↔ 음수
        //쓰기 = 읽기
        int n = 20;

        // 아래에 코드 입력
        n = -n; // n = n-40;

        // 위 작성 코드와 함께 아래 코드를 실행햇을 떄 결과가 다음과 같아야 함
        System.out.println("n = " + n);
        System.out.println("");

        //세 변수 순환시키기
        //a 값 → b 값, b 값 → c 값, c 값 → a 값
        int a = 3, b = 6, c = 9;


        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("");

        //⭐ Swap
        //`a` 값 ↔ `b` 값 뒤바꾸기

        a = 100;
        b = 0;
        System.out.println(LocalDate.now());
        // 아래에 코드 입력
        // 🚫 a = 0; 🚫 b = 100

        temp = a;
        a = b;
        b = temp;

        // 위 작성 코드와 함께 아래 코드를 실행했을 때 결과가 다음과 같아야 함
        System.out.println("a = " + a); //a = 0
        System.out.println("b = " + b); //b = 100
        //final double PI = 3.14;

        System.out.println(LocalDate.now());

    }
}

/*
일상속에 조건찾기
https://truthful-comte-144.notion.site/Java-69e2b09213f84394b0682b5212ac3345
git clone
git hub https ->   terminal -> git clone (url)



 */
