 
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

class runMap{
    public void printMap(Map<Integer,String> hashmap){
                
        hashmap.put(1,"fox");
        hashmap.put(2,"cat");
        hashmap.put(5,"goat");
        hashmap.put(4,"dog");
        hashmap.put(3,"fish");
        hashmap.put(6,"lion");

        System.out.println(hashmap.get(3));

        for(Map.Entry<Integer,String> mapper : hashmap.entrySet()){
            System.out.println(mapper.getKey() + " : "+ mapper.getValue());
        }
    }
}

public class Collection {
    public static void main(String[] args){

        // set
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<>();
        set1.add("fox");
        set1.add("cat");
        set1.add("goat");
        set1.add("dog");
        set1.add("fish");
        set1.add("lion");

        set2.add("dog");
        set2.add("fish");
        set2.add("lion");

        Set<String> intersection = new TreeSet<String>(set1);
        Set<String> difference = new TreeSet<>(set1);

        System.out.println(set1);
        System.out.println(set2);
        intersection.retainAll(set2);
        difference.removeAll(set2);
        
        System.out.println(intersection);
        System.out.println(difference);

        /*
        // Hashmap
        HashMap<Integer,String> hashmap = new HashMap<>();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        System.out.println();
        runMap rm = new runMap();
        rm.printMap(treeMap);
        System.out.println("for loop : map.entry");
        for(Map.Entry<Integer,String> itr: hashmap.entrySet()){
            int key = itr.getKey();
            String value = itr.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println("for loop : forEach");
        hashmap.forEach((key,Value)->System.out.println(key + " : " + Value));
        
        System.out.println("for loop : getkey loop");
        for(Integer Key : hashmap.keySet()){
            System.out.println(Key + ": " + hashmap.get(Key));
        }
        for (String val : hashmap.values()){
            System.out.println(val);
        }
        */
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        // System.out.println(arr.get(1));
        // for(Integer i : arr)System.out.println(i);
        arr.remove(arr.size()-1);
        // list interface
        List<String> listString = new ArrayList<String>();
        listString.add("thisisone");
        listString.add("thisisone");
        // System.out.println(listString.get(0));

        // linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(0);
        int num = linkedList.remove(2);
        // System.out.println(linkedList.size() + " " + num);
        // System.out.println(linkedList.get(0));
    }
    
}
