import java.sql.Date;
import java.time.Clock;
import java.time.Instant;

/**
 * @desc: Clock时钟
 * @author: duchao
 * @date: 2020/01/02 10:52
 */
public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
        Instant instant = clock.instant();
        System.out.println(Date.from(instant));
    }
}
