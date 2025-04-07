package lesson;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FlightTime {

    public static void main(String[] args) {

        String departureCity = "America/Los_Angeles";
        String arrivalCity = "Europe/Berlin";

        LocalTime departureLocalTime = LocalTime.of(15, 5); // 15:05
        Duration flightDuration = Duration.ofHours(10).plusMinutes(50);

        ZonedDateTime arrivalTime = calculateArrivalTime(departureCity, arrivalCity, departureLocalTime, flightDuration);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss zzzz", new Locale("ru"));
        System.out.println("Прилёт будет: " + arrivalTime.format(formatter));
    }


    public static ZonedDateTime calculateArrivalTime(String fromZoneId, String toZoneId,
                                                     LocalTime localDeparture, Duration flightDuration) {

        LocalDate today = LocalDate.now();
        ZoneId fromZone = ZoneId.of(fromZoneId);
        ZoneId toZone = ZoneId.of(toZoneId);

        ZonedDateTime departureTime = ZonedDateTime.of(today, localDeparture, fromZone);
        ZonedDateTime arrivalTimeInFromZone = departureTime.plus(flightDuration);

        return arrivalTimeInFromZone.withZoneSameInstant(toZone);
    }
}