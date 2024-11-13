package condition;

import java.util.Scanner;
import java.util.Random;

public class LoopEx_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("반복 중입니다.");
//            System.out.print("종료하시겠습니까?(y/n): ");
//            char input = scanner.nextLine().charAt(0);
//            // 아래에 코드 추가
//            if (input == 'y') {
//                break;
//            }
//        }
//        System.out.println("반복이 종료되었습니다.");
//
//        for (int i = 1; i <= 50; i++) {
//            int sum = i;
//            if (sum % 2 == 0 ) {
//                System.out.println(sum);
//            }
//        }

//        System.out.print("정수를 입력해주세요: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        System.out.print("n: " + n);
//        while (n > 0) {
//            if (n % 2 == 0) {
//                sum = sum + n;
//                n--;
//            } else {
//                n--;
//            }
//        }
        //System.out.println(" 출력: " + sum);

        //## **업 앤 다운 게임 만들기**
        //
        //변수 `answer`에는 랜덤으로 1 ~ 50 사이의 자연수 하나가 저장됩니다.

        System.out.println("< 1 ~ 50 사이 숫자 맞추기 업 앤 다운 게임 >");
        Random random = new Random();
        final int ANSWER = random.nextInt(50) + 1; // 1 ~ 50 사이의 임의의 정수

        System.out.print("1 ~ 50 사이 숫자를 입력해주세요: ");
        int guess = scanner.nextInt();
        /*
         * guess의 값이 ANSWER에 저장된 값과 같아질 때까지 반복합니다. (다시 말해, 다르면 반복)
         * guess 값이 answer 값보다 크면 "다운!" 출력
         * guess 값이 answer 값보다 작으면 "업!" 출력
         * guess 값이 answer 값과 같으면 "정답!" 출력 후 반복 종료
         * */
        // 아래에 코드 입력
        while (guess != ANSWER) {
            if (guess < 1 || guess > 50) {
                System.out.println("잘못된 수");
                System.out.print("1 ~ 50 사이 숫자를 입력해주세요: ");
                guess = scanner.nextInt();
            }
            if (guess < ANSWER) {
                System.out.println("업!");
                guess = scanner.nextInt();
            } else if (guess > ANSWER) {
                System.out.println("다운!");
                guess = scanner.nextInt();
            }
        }
        if (guess == ANSWER) {
            System.out.println(guess + " 정답!");
        }
    }
}





