import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate xmas = LocalDate.of(2022, Month.DECEMBER, 25);

        int years = xmas.getYear() - today.getYear();
        int months = xmas.getMonthValue() - today.getMonthValue();
        int days = xmas.getDayOfMonth() - today.getDayOfMonth();

        System.out.println(years + " years, " + months + " months, " + days + " days");
        System.out.println();

        Period period = Period.between(today, xmas);
        System.out.println(period.getDays() + " days, " + period.getMonths() + " months, " + period.getYears() + " years");
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nextXmas = xmas.plusYears(1);
        System.out.println("O próximo Natal será em " + nextXmas.format(formatter));

        DateTimeFormatter formatterWithHours = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Hoje é " + now.format(formatterWithHours));

        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("We are in %s at year %d", currentYearMonth.getMonth(), currentYearMonth.getYear());

    }
}
