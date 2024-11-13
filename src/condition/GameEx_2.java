package condition;

import java.util.Random;
import java.util.Scanner;

public class GameEx_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int computerChoice = random.nextInt(3);

        String computer;
        if (computerChoice == 0) {
            computer = "가위";
        } else if (computerChoice == 1) {
            computer = "바위";
        } else {
            computer = "보";
        }
        System.out.println("computer =" + computer);

        // ---

        //목적: 사용자한테 입력을 받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위/바위/보 중의 하나를 입력해 주세요: ");
        String player = scanner.nextLine();
        System.out.println("player = " + player);
        // ---
        //목적: 비교
        //무승부 구현
        if (computer.equals(player)) {
            System.out.println("무승부");
        } else if((player.equals("가위") && computer.equals("보") ||
                    player.equals("바위") && computer.equals("가위") ||
                    player.equals("보") && computer.equals("바위"))) {
            System.out.println("승리");

        }
    }


}
