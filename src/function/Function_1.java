package function;

import java.util.Scanner;

public class Function_1 {
    public static void main(String[] args) {
        age(12);
    }

    public static int age(int age) {
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        while (age < 19) {

            if (age < 19) {
                System.out.println("미성년자");
                break;
            }
        }
        return age;
    }
}
