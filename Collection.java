
import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;

class runMap {
    public void printMap(Map<Integer, String> hashmap) {

        hashmap.put(1, "fox");
        hashmap.put(2, "cat");
        hashmap.put(5, "goat");
        hashmap.put(4, "dog");
        hashmap.put(3, "fish");
        hashmap.put(6, "lion");

        System.out.println(hashmap.get(3));

        for (Map.Entry<Integer, String> mapper : hashmap.entrySet()) {
            System.out.println(mapper.getKey() + " : " + mapper.getValue());
        }
    }
}

class urlLibrary implements Iterable<String> {
    LinkedList<String> urls = new LinkedList<String>();

    public urlLibrary() {
        urls.add("wwww.thisone.com");
        urls.add("wwww.thistwo.com");
        urls.add("wwww.thisthree.com");
    }

    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }

}

class urlLibrary2 {
    LinkedList<String> urls = new LinkedList<String>();

    public urlLibrary2() {
        urls.add("wwww.thisone.com");
        urls.add("wwww.thistwo.com");
        urls.add("wwww.thisthree.com");
    }

}

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        for (Integer i : arr)
            System.out.println(i);
        /*
         * urlLibrary urlLibrary = new urlLibrary(); for (String url : urlLibrary) {
         * System.out.println(url); }
         * 
         * Queue<Integer> q1 = new ArrayBlockingQueue<>(3); Queue<Integer> q2 = new
         * ArrayBlockingQueue<>(3); // throws exception - add,remove,element q1.add(1);
         * q1.add(2); q1.add(4); try { q1.add(3); } catch (Exception e) { // TODO:
         * handle exception System.out.println("okay i ran "); }
         * 
         * for (Integer i : q1) System.out.println(i); System.out.println(q1.element());
         * System.out.println(q1.remove()); System.out.println(q1.remove());
         * 
         * // return speacial value - offer,pull,peek
         * System.out.println("\n seperation \n"); q2.offer(1); q2.offer(2);
         * q2.offer(3);
         * 
         * System.out.println(q2.peek()); System.out.println(q2.poll());
         * System.out.println(q2.poll()); System.out.println(q2.poll());
         * System.out.println(q2.poll()); // set Set<String> set1 = new
         * HashSet<String>(); Set<String> set2 = new LinkedHashSet<>(); set1.add("fox");
         * set1.add("cat"); set1.add("goat"); set1.add("dog"); set1.add("fish");
         * set1.add("lion");
         * 
         * set2.add("dog"); set2.add("fish"); set2.add("lion");
         * 
         * Set<String> intersection = new TreeSet<String>(set1); Set<String> difference
         * = new TreeSet<>(set1);
         * 
         * System.out.println(set1); System.out.println(set2);
         * intersection.retainAll(set2); difference.removeAll(set2);
         * 
         * System.out.println(intersection); System.out.println(difference); //
         * List<Integer> arr = new ArrayList<Integer>();
         * 
         * 
         * // Hashmap HashMap<Integer,String> hashmap = new HashMap<>();
         * LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
         * TreeMap<Integer,String> treeMap = new TreeMap<>();
         * 
         * System.out.println(); runMap rm = new runMap(); rm.printMap(treeMap);
         * System.out.println("for loop : map.entry"); for(Map.Entry<Integer,String>
         * itr: hashmap.entrySet()){ int key = itr.getKey(); String value =
         * itr.getValue(); System.out.println(key + " : " + value); }
         * System.out.println("for loop : forEach");
         * hashmap.forEach((key,Value)->System.out.println(key + " : " + Value));
         * 
         * System.out.println("for loop : getkey loop"); for(Integer Key :
         * hashmap.keySet()){ System.out.println(Key + ": " + hashmap.get(Key)); } for
         * (String val : hashmap.values()){ System.out.println(val); }
         * 
         * ArrayList<Integer> arr = new ArrayList<>(); arr.add(3); arr.add(4);
         * arr.add(5); // System.out.println(arr.get(1)); // for(Integer i :
         * arr)System.out.println(i); arr.remove(arr.size() - 1); // list interface
         * List<String> listString = new ArrayList<String>();
         * listString.add("thisisone"); listString.add("thisisone"); //
         * System.out.println(listString.get(0));
         * 
         * // linked list LinkedList<Integer> linkedList = new LinkedList<>();
         * linkedList.add(1); linkedList.add(2); linkedList.add(3); linkedList.get(0);
         * int num = linkedList.remove(2); // System.out.println(linkedList.size() + " "
         * + num); // System.out.println(linkedList.get(0));
         */
    }

}
