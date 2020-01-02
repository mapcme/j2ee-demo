import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2020/01/02 10:16
 */
public class MapTest {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.putIfAbsent(1,"a");
        map.putIfAbsent(1,"b");
        map.forEach((k,v)-> System.out.println(String.format("%d,%s",k,v)));
        System.out.println(map.containsKey(2));
        //map.compute(1,(k,v)-> k+v+1);
        map.computeIfPresent(1,(k,v)-> v+"a");//key存在，新值不为null，就把新值替换旧值；如果新值为null，则移除key
        //map.computeIfAbsent(2,k-> "此值原本不存在"); //key不存在，就往map put新值
        //map.merge(1,"a2",(o,n)->o.concat(n));
        //map.remove(1,"aa");
        //System.out.println(map.get(1));
        System.out.println(map.getOrDefault(2,"2"));
    }
}
