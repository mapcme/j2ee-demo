import java.util.function.Consumer;

/**
 * @desc: 函数式接口--Consumer
 * @author: duchao
 * @date: 2019/12/30 11:50
 */
public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> consumer = msg->System.out.println(msg);
        consumer.accept("这是Consumer");
    }
}
