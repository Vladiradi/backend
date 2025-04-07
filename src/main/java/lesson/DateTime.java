package lesson;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


public class DateTime {
        public static void main(String[] args) {

            int year = 2024;
            boolean isLeap = Year.isLeap(year);
            System.out.println(year + " високосный: " + isLeap);

            LocalDate today = LocalDate.now();
            Locale india = new Locale("en", "IN");
            DateTimeFormatter formatterIndia = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", india);
            System.out.println("Дата в формате для Индии: " + today.format(formatterIndia));


            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd-MM-yy, dd, D, HH:mm");
            System.out.println("Формат: " + now.format(customFormat));


            LocalDate birthDate = LocalDate.of(1985, Month.JANUARY, 10);
            String birthFormatted = birthDate.getDayOfMonth() + " " +
                    birthDate.getMonth().getDisplayName(TextStyle.FULL, new Locale("ru")) + " " +
                    birthDate.getYear();
            System.out.println("Дата рождения: " + birthFormatted);


            DayOfWeek dayOfWeek = birthDate.getDayOfWeek();
            System.out.println("10 Января 1985 был: " + dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("ru")));

            LocalDate anotherDate = LocalDate.of(2023, Month.APRIL, 7);
            System.out.println("7 апреля 2023 был: " +
                    anotherDate.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ru")));


            LocalDate minusTenYears = birthDate.minusYears(10);
            System.out.println("Дата минус 10 лет: " + minusTenYears.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("ru"))));


            Instant instant = Instant.parse("2022-12-19T06:55:30.00Z");
            System.out.println("Instant: " + instant);


            ZonedDateTime midwayTime = ZonedDateTime.now(ZoneId.of("Pacific/Midway"));
            System.out.println("Время в Pacific/Midway: " + midwayTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss z", new Locale("ru"))));
        }
    }

