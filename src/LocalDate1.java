import java.time.LocalDate;
import  java.time.LocalTime;
public class LocalDate1 {
    public static void main(String[] args) {

        LocalDate currentTime = LocalDate.now();

        System.out.println(currentTime.plusDays(18));
        System.out.println(currentTime.plusDays(19));
    }
}
