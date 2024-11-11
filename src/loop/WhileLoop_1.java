package loop;

public class WhileLoop_1 {
    public static void main(String[] args) {
        int i = 1;
        while (true) {

            System.out.println(i + "번째 실행됨");
            i = i + 1;

            if (i >= 6) {
                break;
            }
        }
    }

}
