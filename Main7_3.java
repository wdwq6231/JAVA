import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main7_3 {
    public static void main(String[] args) {
        if (args.length != 6) {
            return;
        }
        
        int year1 = Integer.parseInt(args[0]);
        int month1 = Integer.parseInt(args[1]);
        int day1 = Integer.parseInt(args[2]);
        int year2 = Integer.parseInt(args[3]);
        int month2 = Integer.parseInt(args[4]);
        int day2 = Integer.parseInt(args[5]);
        
        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);
        
        long daysDiff = Math.abs(ChronoUnit.DAYS.between(date1, date2));
        
        System.out.println("日期1：" + date1);
        System.out.println("日期2：" + date2);
        System.out.println("天数间隔：" + daysDiff + " 天");
    }
}
