import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.get(1));
        for(Integer i : arr)System.out.println(i);
        arr.remove(arr.size()-1);

        // list interface
        List<String> listString = new ArrayList<String>();
        listString.add("thisisone");
        listString.add("thisisone");
        System.out.println(listString.get(0));
    }
    
}
