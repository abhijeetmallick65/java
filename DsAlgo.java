import java.util.HashMap;

public class DsAlgo {

    public int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0,
        diff = 0,temp = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i : arr){
            diff = i - k;
            if(hashMap.get(i) != null){
                count += hashMap.get(i);
            }
            
            if(hashMap.get(i)!=null){
                temp = hashMap.get(i);
                hashMap.put(i, temp+1);
            }else{
                hashMap.put(i, 1);
            }
        }
        return count;   
    }

    public static void main(String[] args) {
        // Mechanic mechanic = new Mechanic();
        // mechanic.start();

        Car car = new Car();
        // car.getAge();
    }
}