import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2020/01/02 11:03
 */
@Repeatable(Hints.class)
public @interface Hint {
    String value();
}
