import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @desc: 函数式接口--Predicate
 * @author: duchao
 * @date: 2019/12/30 13:41
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<List<Integer>> predicate1=(list)->list==null;
        Predicate<List<Integer>> predicate2=(list)->list.size()>0;
        //System.out.println(predicate.test(Arrays.asList(1,2,3)));
        System.out.println(predicate1.or(predicate2).test(Arrays.asList(1,2,3)));
    }
}
