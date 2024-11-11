package condition;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        char gender  = scanner.next().charAt(0);
            if (age > 20 && gender == 'm') {
                System.out.println("입영대상입니다.");
            }
    }
}
