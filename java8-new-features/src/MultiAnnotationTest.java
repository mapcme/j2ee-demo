/**
 * @desc: Annotation多重注解
 * @author: duchao
 * @date: 2020/01/02 11:02
 */
public class MultiAnnotationTest {

    public static void main(String[] args) {
        Hint hint = Cat.class.getAnnotation(Hint.class);
        System.out.println(hint);                   // null
        Hints hints1 = Cat.class.getAnnotation(Hints.class);
        //System.out.println(hints1.value().length);  // 2

        Hint[] hints2 = Cat.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);          // 2
    }


}
