/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/30 09:06
 */
public class Test {
    public static void main(String[] args) {

        testInterfaceLambda();

    }

    public static void testInterfaceLambda(){
        IAnimal iAnimal1 = new IAnimal() {
            @Override
            public void hello(String name) {
                System.out.println(name);
            }
        };
        iAnimal1.hello("我是匿名函数");
        iAnimal1.desc(null);

        IAnimal iAnimal2 = (name)-> System.out.println(name);
        iAnimal2.hello("我是lambda表达式");
    }

}
