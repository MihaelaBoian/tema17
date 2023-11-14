import java.time.*;
public class Main {
    public static void main(String[] args) {

//  Exercitiu 1:
        LocalDate data1 = LocalDate.of(2024,Month.JANUARY,2);
        System.out.println(data1);
//        exercitiu 2:
        LocalTime time1 = LocalTime.of(13,20);
        System.out.println(time1);
//        exercitiu 3:
        LocalDateTime datetime1 = LocalDateTime.of(2024,1,2,13,20);
        System.out.println(datetime1);
//Exercitiu 4:
        ZoneId zone = ZoneId.of("America/Los_Angeles");
//        int ZoneId;
         ZonedDateTime zone1 = ZonedDateTime.of(2024, 1, 2, 13, 20,30,40,zone);
        System.out.println(zone1);
//      Exercitiu 5:
        datetime1  = datetime1.plusMinutes(1);
        System.out.println(datetime1);
        datetime1 = datetime1.plusHours(1);
        System.out.println(datetime1);
        datetime1 = datetime1.plusDays(1);
        System.out.println(datetime1);
        datetime1 = datetime1.plusYears(1);
        System.out.println(datetime1);



    }
}
