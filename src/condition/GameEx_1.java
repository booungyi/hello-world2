package condition;

import java.util.Scanner;
import java.util.Random;

public class GameEx_1 {
    public static void main(String[] args) {

        int win = 0;
        int lose = 0;
        int same = 0;
        double winLate = 0;
        int gameSet = 0;
        while (true) {
            Random random = new Random();
            int computerChoice = random.nextInt(3);
            Scanner scanner = new Scanner(System.in);

            System.out.println("가위, 바위, 보 중 하나를 선택하세요 (종료 입력 시 게임 종료):");
            String you = scanner.next();


            if (you.equals("가위")) {
                if (computerChoice == 0) {
                    System.out.println("컴퓨터의 선택: 가위");
                    System.out.println("무승부");
                    same += 1;
                    gameSet = gameSet + 1;

                } else if (computerChoice == 1) {
                    System.out.println("컴퓨터의 선택 : 바위");
                    System.out.println("당신이 졋습니다!");
                    lose += 1;
                    gameSet = gameSet + 1;

                } else {
                    System.out.println("컴퓨터의 선택: 보");
                    System.out.println("당신이 이겻습니다!");
                    win += 1;
                    gameSet = gameSet + 1;
                }
            }
            else if (you.equals("바위")) {
                if (computerChoice == 0) {
                    System.out.println("컴퓨터의 선택: 가위");
                    System.out.println("당신이 이겼습니다!");
                    win += 1;
                    gameSet = gameSet + 1;

                } else if (computerChoice == 1) {
                    System.out.println("컴퓨터의 선택 : 바위");
                    System.out.println("무승부!");
                    same += 1;
                    gameSet = gameSet + 1;
                    you = scanner.next();

                } else {
                    System.out.println("컴퓨터의 선택: 보");
                    System.out.println("당신이 졋습니다!");
                    lose += 1;
                    gameSet = gameSet + 1;
                }

            } else if (you.equals("보")) {
                if (computerChoice == 0) {
                    System.out.println("컴퓨터의 선택 : 가위");
                    System.out.println("당신이 졋습니다!");
                    lose += 1;
                    gameSet = gameSet + 1;
                } else if (computerChoice == 1) {
                    System.out.println("컴퓨터의 선택 :바위");
                    System.out.println("당신이 이겻습니다!");
                    win += 1;
                    gameSet = gameSet = 1;
                } else {
                    System.out.println("컴퓨터의 선택: 보");
                    System.out.println("무승부!");
                    same += 1;
                    gameSet = gameSet + 1;
                }

            }
            if (you.equals("종료")) {
                winLate =  ((double) (win *100) / (win + lose));
                System.out.println("총 게임수: " + gameSet + ", 승리: " + win + " , 패배: " + lose + ", 무승부: " + same);
                System.out.println("승률 = " + winLate +"%");
                break;
            }
        }
    }
}

