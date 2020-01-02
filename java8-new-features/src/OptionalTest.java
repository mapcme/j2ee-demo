import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2020/01/02 08:53
 */
public class OptionalTest {
    private static List<Integer> list= Arrays.asList(1,2,3,5);

    public static void main(String[] args) {
        testMap();
    }

    public static void testMap(){

        Optional<List<Integer>> optional=Optional.of(list);
        System.out.println(optional.map(t-> list.stream().findFirst().get()).get());
    }

    public static void testFilter(){

        Optional<List<Integer>> optional=Optional.of(list);
        System.out.println(optional.filter(t->list.size()>=0).get());
    }

    public static void test1(){
        Optional<String> optional=Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        optional.ifPresent(v-> System.out.println(v));
        System.out.println(optional.orElse("没有"));
    }
}
