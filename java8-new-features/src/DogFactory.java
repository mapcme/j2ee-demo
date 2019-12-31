/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/30 11:29
 */
@FunctionalInterface
public interface DogFactory<T extends Dog> {
    T create(String name,int age);

}
