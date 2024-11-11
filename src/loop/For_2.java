package loop;

public class For_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i: " + i);
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.println("i:" + i);
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println("구구단 "+i+"단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +" x "+ j +" = "+ (i * j) );
            }
            System.out.println();
        }

    }
}
