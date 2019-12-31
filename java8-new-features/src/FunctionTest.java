import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @desc: 函数式接口--Function
 * @author: duchao
 * @date: 2019/12/30 13:37
 */
public class FunctionTest {
    public static void main(String[] args) {
        //Function<List<String>,Integer> function=(list)->list.size();
        //System.out.println(function.apply(Arrays.asList("a","b","c")));

        Function<String,String> function2=(t)->"元素长度2："+t;
        Function<String,Integer> function3=String::length;
        Function<String,String> function4=(t)->"元素长度4："+t;
        System.out.println(function2.andThen(function3).apply("1223"));
        System.out.println(function2.compose(function4).apply("123"));
    }
}
