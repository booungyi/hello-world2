package condition;

import java.util.Scanner;

public class WhileEx_2 {
    public static void main(String[] args) {

//        int i = 10;
//        while (i <= 0) {
//            System.out.println("i의 값:" + i);
//            i++;
//        }
//        System.out.println();
//        for (i = 10; i >= 0; i--) {
//            System.out.println("i의 값: " + i);
//        }
//        System.out.println();
//        i = 3;
//        while (i < 34) {
//            System.out.println(i + "를 3으로 나눴을 떄 나머지: " + i % 3);
//            i++;
//        }
//        System.out.println();
//        for (i = 3; i < 34; i++) {
//            System.out.println(i + "를 3으로 나눴을 떄 나머지: " + i % 3);
//        }
        //아래 코드는 잘못된 나이(0보다 작은 숫자)를 입력해도 그대로 age에
        // 저장됩니다. 정상적인 숫자를 입력했을 경우에만 저장하도록 코드를 작성해 주세요.

        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int input = scanner.nextInt();
        while (input < 0) {
            System.out.print("나이를 입력하세요: ");
            input = scanner.nextInt();
        }
        int age = input;
        System.out.println("입력받은 age: " + age);
        if (age < 19) {
            System.out.println("미성년자");
        }
        System.out.println("성인");


        int sum = 0;
        for (int i = 0; i <=100 ; i++) {
            sum = sum + i;
            System.out.println("sum = " + sum);
        }
    }
}
