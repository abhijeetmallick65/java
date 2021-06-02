import java.util.LinkedList;
import java.util.*;

/**
 * AppIter
 */
public class AppIter {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        arr.add("fox");
        arr.add("cat");
        arr.add("dog");
        arr.add("mouse");
        arr.add("lion");

        // modern loop
        for (String i : arr) {
            String val = i;
            // System.out.println(val);
        }
        // iterator
        Iterator<String> it = arr.iterator();
        while (it.hasNext()) {
            String val = it.next();
            System.out.println(val);
            if (val == "fox") {
                it.remove();
                System.err.println("fox removed");
            }

        }
    }
}