import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/30 10:48
 */
public class Test2 {

    public static void main(String[] args) {
        test();
    }

    private static void test(){
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return a.compareTo(b);
//            }
//        });

        Comparator<String> comparator = String::compareTo;
        Collections.sort(names, comparator);

        System.out.println(Arrays.toString(names.toArray()));


    }
}
