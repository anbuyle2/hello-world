import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "an");
        map.put(3, "Bart");
        map.put(4, "Marie");

        Set<Integer> keys1 = map.keySet();
        map.put(5, "Paul");
        Set<Integer> keys2 = map.keySet();
        System.out.println(keys2);
        keys1.remove(1);
        System.out.println(keys2);
    }
}
