import java.time.ZoneId;

/**
 * @desc: ZoneId时区
 * @author: duchao
 * @date: 2020/01/02 10:56
 */
public class ZoneIdTest {

    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
// prints all available timezone ids
        ZoneId zone1 = ZoneId.of("Etc/GMT+8");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());

// ZoneRules[currentStandardOffset=+01:00]
// ZoneRules[currentStandardOffset=-03:00]
    }
}
