import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

class Gigasecond {

    private LocalDateTime calculateSecond;
    private static long GIGASECONDS = 1000000000L;

    Gigasecond(LocalDate birthDate) {

        this.calculateSecond = birthDate.atTime(0,0);
    }

    Gigasecond(LocalDateTime birthDateTime) {

        this.calculateSecond = birthDateTime;
    }

    LocalDateTime getDateTime() {

        return calculateSecond.plusSeconds(GIGASECONDS);
    }

}
