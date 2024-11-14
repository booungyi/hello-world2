package condition;

import java.util.Random;
import java.util.Scanner;

public class GameEx_2 {
    public static void main(String[] args) {

        int win = 0;
        int lose = 0;
        double winLate = 0.0;
        int gameScore = 0;
        int same = 0;

        while (true) {
            Random random = new Random();
            int randomInt = random.nextInt(3);
            // ----
            // 목적: 저 랜덤한 정수를 "가위"/"바위"/"보"로 바꾸자
            // 0: "가위", 1: "바위", 2: "보"
            String computer;
            if (randomInt == 0) {
                computer = "가위";
            } else if (randomInt == 1) {
                computer = "바위";
            } else {
                computer = "보";
            }
            // ----

            // 목적: 사용자한테 입력을 받는다.
            Scanner scanner = new Scanner(System.in);
            System.out.print("가위/바위/보 중의 하나를 입력해 주세요: ");
            String player = scanner.nextLine();

            if (player.equals("종료")) {
                winLate = ((double) (win * 100) / (win + lose));
                System.out.println("총 게임수: " + gameScore + ", 승리: " + win + ", 패배: " + lose + ", 무승부: " + same);
                System.out.println("승률: "+ winLate);
                break;
            }
            // ---

            // 가정: 입력이 알아서 잘 들어왔을 것이다
            // 목적: 비교
            if (computer.equals(player)) {
                System.out.println("컴퓨터의 선택: " +computer);
                System.out.println("무승부");
                same += 1;
                gameScore += 1;
            } else if ((player.equals("가위") && computer.equals("보")) ||
                    (player.equals("바위") && computer.equals("가위")) ||
                    (player.equals("보") && computer.equals("바위"))) {

                System.out.println("컴퓨터의 선택: " +computer);
                System.out.println("당신이 이겼습니다!");
                win += 1;
                gameScore += 1;
            } else {
                System.out.println("컴퓨터의 선택: " +computer);
                System.out.println("패배");
                gameScore += 1;
                lose += 1;
            }
        }
    }
}