import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @desc: Stream类
 * @author: duchao
 * @date: 2020/01/02 09:17
 */
public class StreamTest {

    private static List<Integer> list = Arrays.asList(1, 2, 3, 5);

    public static void main(String[] args) {
        //testFilter();
        //testMap();
        //testMapToInt();
        //testMapToDouble();
        //testFlatMap();
        //testDistinct();
        //testDistinct();
        //testSort();
        //testAnyMatch();
        //testAllMatch();
        //testNoneMatch();
        //testReduce();
        //testParallelStream();
        //testPeek();
        //testLimit();
        //testMin();
        testFindAny();
    }

    public static void testFindAny(){
        System.out.println(list.stream().findAny().get());
    }

    public static void testMin(){
        List<String> list = Arrays.asList("one", "two", "three", "four");
        System.out.println(list.stream().min((a,b)->a.compareToIgnoreCase(b)).get());
        System.out.println(list.stream().max((a,b)->a.compareToIgnoreCase(b)).get());
    }

    public static void testLimit(){
        System.out.println(Stream.of("one", "two", "three", "four").limit(2).collect(Collectors.toList()));
    }

    public static void testPeek() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

    public static void testParallelStream() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        long s1 = System.nanoTime();

        list.stream().sorted();

        long s2 = System.nanoTime();

        list.parallelStream().sorted();

        long s3 = System.nanoTime();

        System.out.println(String.format("串行排序耗时：%d", s2 - s1));
        System.out.println(String.format("并行排序耗时：%d", s3 - s2));

    }

    public static void testReduce() {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.reduce((a, b) -> a + b).get());
    }

    public static void testNoneMatch() {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.noneMatch(s -> s > 2));
    }

    public static void testAllMatch() {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.allMatch(s -> s > 0));
    }

    public static void testAnyMatch() {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.anyMatch(s -> s > 3));
    }

    public static void testSort() {
        Stream<Integer> list1 = list.stream();
        list1.sorted((a, b) -> b - a).forEach(System.out::println);

    }

    public static void testDistinct() {
        Stream<Integer> list1 = list.stream();
        Stream<Integer> list2 = list1.distinct();
        System.out.println(list1 == list2);
    }

    public static void testFlatMap() {
        list.stream().flatMap(s -> Stream.of(s + 1)).forEach(s -> System.out.print(s + "  "));
    }

    public static void testMapToDouble() {
        list.stream().mapToDouble(s -> s + 1).forEach(s -> System.out.print(s + "  "));
    }

    public static void testMapToInt() {
        list.stream().mapToInt(s -> s + 1).forEach(s -> System.out.print(s + "  "));
    }

    public static void testMap() {
        list.stream().map(s -> s + 1).forEach(s -> System.out.print(s + "  "));
    }

    public static void testFilter() {
        list.stream().filter(s -> s > 2).forEach(s -> System.out.print(s + "  "));
    }

    public static void testCollection() {
        System.out.println(list.stream().findFirst().get());
    }

    public static void testCount() {
        Stream<List<Integer>> stream = Stream.of(list);
        System.out.println(stream);
        //System.out.println(stream.findFirst().get());
        System.out.println(stream.count());
    }
}
