import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @desc: 函数式接口--Comparator
 * @author: duchao
 * @date: 2020/01/02 08:43
 */
public class ComparatorTest {
    public static void main(String[] args) {
        //Comparator<Integer> comparator=Integer::compareTo;
        //Comparator<Integer> comparator= Comparator.comparingInt(a -> a);
        Comparator<Integer> comparator= Integer::compare;
        List<Integer> list = Arrays.asList(2,3,1);
        Collections.sort(list,comparator);
        System.out.println(list);
    }
}
