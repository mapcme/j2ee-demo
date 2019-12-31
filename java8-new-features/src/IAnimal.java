import java.util.Objects;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/30 09:05
 */
@FunctionalInterface
public interface IAnimal {

    void hello(String name);

    static void say(){
        System.out.println("我是一个动物");
    }

    default void desc(String msg){
        System.out.println(Objects.isNull(msg)?"我是一个小动物":msg);
    }

    @Override
    boolean equals(Object obj);
}
