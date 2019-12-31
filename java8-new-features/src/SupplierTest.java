import java.util.function.Supplier;

/**
 * @desc: 函数式接口--
 * @author: duchao
 * @date: 2019/12/30 13:34
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier=()->"小米";
        System.out.println(supplier.get());
    }
}
