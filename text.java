import java.util.Scanner;

// person
class Person{
    // instance variables
    String name= "mallick";
    int age; 
    String[] arr = {"Bmw","Lambo"};
    // method
    void greet(){
        System.out.println("Hello " + name);
    }
    // getters
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String[] getArr(){
        return arr;
    }

    public void parameterMethods(int distance,String direction){
        System.out.println(direction +" : "+distance);
    }
}

// furniture
class furniture{
    String type;
    int price;
} 
/**
 * text
 */
public class text {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
// furniture object
furniture x = new furniture();
x.price = 90;
x.type = "Table";
// System.out.println(x.type + " : " + x.price);
// person object/instance
        Person person1 = new Person();
        person1.age = 19;
        String[] arr = person1.getArr();
        System.out.println(arr[0]);
    person1.parameterMethods(12, "North");
        // System.out.println(person1.getAge() + " " + person1.getName());
        // person1.name = "Abhijeet";
        // System.out.println(person1.name);
        // person1.greet();
        // System.out.println(person1.name);



/*
        // print data to console
        System.out.println("");

        
        // 8 primitive data types
        int num = 18;
        short shortNum = 8;
        long longNum = 190;
        double doubleFloat = 345.3;
        float  floatNum = 345.3f;
        char character = 'a';
        // int test;
        boolean boolValue = true;
        byte byteNum = 127;
        System.out.println(String.format("%c %f %b",character,floatNum,boolValue));

        // strings
        String firstName = "Abhijeet";
        String lastName = "mallick";        
        System.out.println(firstName + " " + lastName);

        // while loop
        while(num > 10){
            // System.out.println(num);
            num-=1;
        }

        // for loop
        for(int i =0;i<5;i++){
            System.out.printf("%d\n",i);
        }

        // if else
        int n= 5;
        while(n < 10){
             n++;
            System.out.println("'i run everytime'");
            if (n==8){
                break;
            }else if(n==5){
                continue;
            }else{
                System.out.println(n);
            }
           
        }

        // user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String user = input.nextLine();
        int num = input.nextInt();
        System.out.println(user+num);
        int value ;
        do{
            System.out.println("Enter a value");
            value = input.nextInt();
        }while(value != 5);
        System.out.println(value + " Great :D");
        // Switch
        String s = input.nextLine();
        switch(s){
            case "abc":
            System.out.println("ok");
            break;
            case "bca":
            System.out.println("ko");
            break;
            default:
            System.out.println("okko");
        }
       

        // Arrays
        String[] arr;
        arr = new String[3];
        arr[0] = "Bmx";
        arr[1] = "car";
        // System.out.println(arr[0]);
        // System.out.println(arr[2]);
        int[] values = {1,2,3,4,5,7,8};
        // System.out.println(values);
        for (String i : arr){
            System.out.println(i);
        }
        for(int i = 0 ; i < values.length ; i++){
            System.out.println(values[i]);
        }
        
        // multi - dimensional array
        String[][] arr = {
            {"A","B"},
            {"a"},
            {}
        };
        // System.out.println(arr[2]);

        int[][] values = new int[2][3];
        values[0][1] = 5;
        System.out.println(values[0][1]);

        int[][] x ;
        x =new int[][]{
            {1,2,3},
            {3,4},
            {32,32}
        };
        System.out.println(x[2][1]);
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("");
        for(String i : s){
            System.out.println(i);
        }
        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ;  i < num ;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
       
        String[] arr = new String[1];
        arr[0] = "okay";
        System.out.println(arr.length);
        System.out.println(arr[0]);
 */
// close input stream
input.close();
    }
}
