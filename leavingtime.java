import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class leavingtime {
    public static void main(String[] args) {
        LocalTime arrivalTime = LocalTime.of(11, 0); // 11 am

        int workHours = 8;

        LocalTime leavingTime = arrivalTime.plusHours(workHours);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedLeavingTime = leavingTime.format(formatter);

        System.out.println("Praveen will leave the office at " + formattedLeavingTime);
    }
}

