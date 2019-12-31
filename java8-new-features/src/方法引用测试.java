/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/30 11:30
 */
public class 方法引用测试 {
    public static void main(String[] args) {
        DogFactory dogFactory = Dog::new;
        DogFactory dogFactory2 = (name,age)-> new Dog(name,age);
        System.out.println(dogFactory.create("小米",12));
    }
}
