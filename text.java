import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import plant.*;
import ocean.*;
import java.io.*;
import java.io.BufferedReader;
// file
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

/*
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

// class frog
class frog{
    private String name ;
    private int age;
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String name){
        // explicitly refer instance variable
        this.name = name;
    }
    public void setNameAge(String name, int age){
        setAge(age);
        this.setName(name);
    }
    public void getNameAge(){
        System.out.println(name +" "+age);
    }

}
 class Plant {
    public void grow() {
        System.out.println("Plant growing");
    }
}
 class Tree extends Plant {

    
    public void grow() {
        System.out.println("Tree growing");
    }
    
    public void shedLeaves() {
        System.out.println("Leaves shedding.");
    }
    
}


// furniture
class furniture{
    String type;
    int price;
} 

// machine class -> constructors
class Machine {
    private String name;
    private int code;
    
    public Machine() {
        this("Arnie", 0);
        
        System.out.println("Constructor running!");
    }
    
    public Machine(String name) {
        this();
        
        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other constructor above.
        //this.name = name;
    }
    
    public Machine(String name, int code) {
        
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
        System.out.println(name+ code);
    }
}

// static and final
class Media{
    public String name;
    public int age;
    public final static String TYPE = "Human";
    public static int count = 0;
    public static int id = 0;

    public void member(String name, int age){
        this.name = name ;
        this.age = age;
        id = count;
        count++;
        System.out.println(id + " : " + name +" : "+age);
    }
    public static void countCheck(){
        System.out.println(count);
    }

    public String toString(){
        return id + " " + count;
    }
}
class Crew extends Media{
    public static void countCheck(){
        System.out.println("Updated");
    }
    public void crewDoes(){
        System.out.println("Reporting");
    }

}


class x implements Info{
    public void print1() {
        System.out.println("print 1");
    }

    public void print2(){
        System.out.println("print2");
    }

}

class Machine {
    public void start(){
        System.out.println("Machine Started !");
    }
}
class Camera extends Machine{
    public void start(){
        System.out.println("Camera Started !");
    }
    public void snap(){
        System.out.println("Picture taken !");
    }
}
class Machine {
    public void start(){
        System.out.println("Machine started");
    }
    
} 
interface Plant{
    public void grow();
}
class Machines{
    Machines(){
        this.toString();
    }
    public String toString(){
        return "this is a machine";
    }
    public void start(){
        System.out.println("machine started");
    }
}
class Cameras extends Machines{

    public String toString(){
        return "this is a camera";
    }
    public void snap(){
        System.out.println("taking picture");
    }
    public void start(){
        System.out.println("camera started");
    }
}

class Ol extends Field{
    Ol(int i){
        super(i);
    }
    public void start(){
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.io);
        System.out.println(this.y);
    }
}
*/
/**
 * text
 */
public class text {

    /**
     *
<<<<<<< HEAD
     
public static void s1(ArrayList<?> machines){
    for(Object i : machines){
        System.out.println(i);
        
    }
}
public static void s2(ArrayList<? extends Machines> machines){
    for(Machines i : machines){
        System.out.println(i);
        i.start();
    }
}
public static void s3(ArrayList<? super Cameras> machines){
    for(Object i : machines){
        System.out.println(i);
    }
}*/
    public static void main(String[] args) throws FileNotFoundException{
        linkedlist ll = new linkedlist();
        ll.insert(0);
        ll.insert(1);
        ll.insert(2);
        ll.display();
        /*
        Robot robot = new Robot(5);
        robot.start();
        robot.start();
        // this only works if brain is declared public 
        // Robot.Brain brain = robot.new Brain();
        // brain.think();
        Robot.Battery battery = new Robot.Battery(); 
        battery.charge();


        Ol Ola = new Ol(4);
        Ola.start();
        // Machines machines = new Machines();
        ArrayList<Machines> list = new ArrayList<>();
        list.add(new Machines());
        list.add(new Machines());
        ArrayList<Cameras> list2 = new ArrayList<>();
        list2.add(new Cameras());
        list2.add(new Cameras());
        // s1(list2);
        s2(list2);
        
        
        int[][] a = new int[3][4];
        System.out.println(a[3][4]);
        Double d = 9.7;
        Double dd = 9.7;
        System.out.println(d == dd);
        System.out.println(d.equals(dd));
        Integer num1 = 6;
        Integer num2 = 6;
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
        String s = "hello";
        String g  = "gello";
        System.out.println(s== g);
        System.out.println(s.equals(g));
       
        File file = new File("example.txt");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
            br.write("New line added");
            br.newLine();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("unable to read : "+ file.toString());
        }
        tryWithResources tr = new tryWithResources();
        tr.resource();
        fileReader eh = new fileReader();
        eh.method();
        Camera camera = new Camera();
        camera.setId(5);
        camera.getId();
        camera.run();
        String path = "D:/Courses/@Java/eample.txt";
        String s = new String("this is a string");
        System.out.println(s);
        System.out.println(path.length());
        File file = new File(path);
        Scanner in = new Scanner(file);
        int count = 0;
        int value = in.nextInt();

        // to read the next line character -- carrige return line feed
        in.nextLine();
        System.out.println(value);
        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(count + " : " +line);
            count++;
        }
        in.close();

        // Anonymous classes
        Machine machine  = new Machine(){
            public void start(){
                System.out.println("anonymous started");
            }
        };
        machine.start();
        Plant plant = new Plant(){
            public void grow(){
                System.out.println("plant grow");
            }
        };
        plant.grow();

        // generics
        HashMap<Integer,String> hash= new HashMap<>();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("dog");
        arr.add("cat");
        System.out.println(arr.get(1));
        System.out.println("PRINT");
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting
        Machine machine2 = camera1;
        machine2.start();
        // Downcasting
        Machine machine3 =new Camera();
        Camera camera3 =(Camera)machine3;
        camera3.snap();
        
        x o = new x();
        o.print1();
        o.print2();
        i.print2();
        Info i = new x();
        int[] c = new int[5];
        c[4] = 5;
        System.out.println(c[4]);
        System.out.println(c[0]);
        Plant plant1 = new Plant();
        // Tree is a kind of Plant (it extends Plant)
        Tree tree = new Tree();
        // Polymorphism guarantees that we can use a child class
        // wherever a parent class is expected.
        Plant plant2 = tree;
        
        // plant2 references a Tree, so the Tree grow() method is called.
        plant2.grow();
        
        // The type of the reference decided what methods you can actually call;
        // we need a Tree-type reference to call tree-specific methods.
        tree.shedLeaves();
        Media m = new Media();
        Crew c = new Crew();
        Media cm = c;
        // m.countCheck();
        // cm.countCheck();
        System.out.println(m);
        System.out.println(cm);
        c.crewDoes();
        cm.countCheck();
        // cm.crewDoes();
         Plant p= new Plant();
         Oak o = new Oak();
         Field f = new Field();
        // protected -- access within same package
        //  p.age;
    System.out.println(Media.count);        
    Media m= new Media();
    System.out.println(m.count);
=======
     * 
     * public static void s1(ArrayList<?> machines){ for(Object i : machines){
     * System.out.println(i);
     * 
     * } } public static void s2(ArrayList<? extends Machines> machines){
     * for(Machines i : machines){ System.out.println(i); i.start(); } } public
     * static void s3(ArrayList<? super Cameras> machines){ for(Object i :
     * machines){ System.out.println(i); } }
     */
    public static void main(String[] args) throws FileNotFoundException {
<<<<<<< HEAD
        Mechanic m = new Mechanic();
        z xc = new z();
        xc.ageSum(5);
=======
>>>>>>> 5af5926e14fe969c914f43611ec56ad5eb8bdf40

>>>>>>> 3f73db5bd218a557ef60471b6e48d0833c35b308
        /*
         * Animal animal = Animal.CAT; switch (animal) { case CAT:
         * System.out.println("cat"); break; case DOG: System.out.println("dog"); break;
         * case MOUSE: System.out.println("mouse"); break; default:
         * System.out.println("default"); } System.out.println(Animal.DOG);
         * System.out.println("Enum name as a string: " + Animal.DOG.name());
         * System.out.println(Animal.DOG.getClass()); System.out.println(Animal.DOG
         * instanceof Enum); System.out.println(Animal.valueOf("CAT")); Animal name =
         * Animal.valueOf("CAT"); System.out.println("explicit name : " + name);
         * System.out.println(Animal.MOUSE.getName());
         * 
         * Robot robot = new Robot(5); robot.start(); robot.start(); // this only works
         * if brain is declared public // Robot.Brain brain = robot.new Brain(); //
         * brain.think(); Robot.Battery battery = new Robot.Battery(); battery.charge();
         * 
         * Ol Ola = new Ol(4); Ola.start(); // Machines machines = new Machines();
         * ArrayList<Machines> list = new ArrayList<>(); list.add(new Machines());
         * list.add(new Machines()); ArrayList<Cameras> list2 = new ArrayList<>();
         * list2.add(new Cameras()); list2.add(new Cameras()); // s1(list2); s2(list2);
         * 
         * 
         * int[][] a = new int[3][4]; System.out.println(a[3][4]); Double d = 9.7;
         * Double dd = 9.7; System.out.println(d == dd);
         * System.out.println(d.equals(dd)); Integer num1 = 6; Integer num2 = 6;
         * System.out.println(num1 == num2); System.out.println(num1.equals(num2));
         * String s = "hello"; String g = "gello"; System.out.println(s== g);
         * System.out.println(s.equals(g));
         * 
         * File file = new File("example.txt"); try (BufferedWriter br = new
         * BufferedWriter(new FileWriter(file))){ br.write("New line added");
         * br.newLine(); } catch (Exception e) { //TODO: handle exception
         * System.out.println("unable to read : "+ file.toString()); } tryWithResources
         * tr = new tryWithResources(); tr.resource(); fileReader eh = new fileReader();
         * eh.method(); Camera camera = new Camera(); camera.setId(5); camera.getId();
         * camera.run(); String path = "D:/Courses/@Java/eample.txt"; String s = new
         * String("this is a string"); System.out.println(s);
         * System.out.println(path.length()); File file = new File(path); Scanner in =
         * new Scanner(file); int count = 0; int value = in.nextInt();
         * 
         * // to read the next line character -- carrige return line feed in.nextLine();
         * System.out.println(value); while(in.hasNextLine()){ String line =
         * in.nextLine(); System.out.println(count + " : " +line); count++; }
         * in.close();
         * 
         * // Anonymous classes Machine machine = new Machine(){ public void start(){
         * System.out.println("anonymous started"); } }; machine.start(); Plant plant =
         * new Plant(){ public void grow(){ System.out.println("plant grow"); } };
         * plant.grow();
         * 
         * // generics HashMap<Integer,String> hash= new HashMap<>(); ArrayList<String>
         * arr = new ArrayList<String>(); arr.add("dog"); arr.add("cat");
         * System.out.println(arr.get(1)); System.out.println("PRINT"); Machine machine1
         * = new Machine(); Camera camera1 = new Camera(); machine1.start();
         * camera1.start(); camera1.snap();
         * 
         * // Upcasting Machine machine2 = camera1; machine2.start(); // Downcasting
         * Machine machine3 =new Camera(); Camera camera3 =(Camera)machine3;
         * camera3.snap();
         * 
         * x o = new x(); o.print1(); o.print2(); i.print2(); Info i = new x(); int[] c
         * = new int[5]; c[4] = 5; System.out.println(c[4]); System.out.println(c[0]);
         * Plant plant1 = new Plant(); // Tree is a kind of Plant (it extends Plant)
         * Tree tree = new Tree(); // Polymorphism guarantees that we can use a child
         * class // wherever a parent class is expected. Plant plant2 = tree;
         * 
         * // plant2 references a Tree, so the Tree grow() method is called.
         * plant2.grow();
         * 
         * // The type of the reference decided what methods you can actually call; //
         * we need a Tree-type reference to call tree-specific methods.
         * tree.shedLeaves(); Media m = new Media(); Crew c = new Crew(); Media cm = c;
         * // m.countCheck(); // cm.countCheck(); System.out.println(m);
         * System.out.println(cm); c.crewDoes(); cm.countCheck(); // cm.crewDoes();
         * Plant p= new Plant(); Oak o = new Oak(); Field f = new Field(); // protected
         * -- access within same package // p.age; System.out.println(Media.count);
         * Media m= new Media(); System.out.println(m.count);
         * 
         * Mechanic m = new Mechanic(); m.start(); /* Car c = new Car(); c.stop(); Aqua
         * aa = new Aqua(); aa.check(); System.out.println(c.age);
         * System.out.println(c.b); // not allowed // System.out.println(c.name);
         * 
         * System.out.println(""); System.out.println("hello"); Media p1 = new Media();
         * System.out.println(p1); // Scanner input = new Scanner(System.in); //
         * System.out.print("/n" + info); StringBuilder info = new StringBuilder();
         * info.append("My name is :").append(" Abhijeet").toString();
         * p1.member("member 1", 12); Media.countCheck();
         * 
         * Machine m1 = new Machine("data",1);
         * 
         * frog froggy = new frog(); froggy.setNameAge("froggy", 12); //
         * froggy.getNameAge();
         * 
         * // furniture object furniture x = new furniture(); x.price = 90; x.type =
         * "Table"; // System.out.println(x.type + " : " + x.price); // person
         * object/instance Person person1 = new Person(); person1.age = 19; String[] arr
         * = person1.getArr(); System.out.println(arr[0]); //
         * person1.parameterMethods(12, "North"); // System.out.println(person1.getAge()
         * + " " + person1.getName()); // person1.name = "Abhijeet"; //
         * System.out.println(person1.name); // person1.greet(); //
         * System.out.println(person1.name);
         * 
         * 
         * 
         * 
         * // print data to console System.out.println("");
         * 
         * 
         * // 8 primitive data types int num = 18; short shortNum = 8; long longNum =
         * 190; double doubleFloat = 345.3; float floatNum = 345.3f; char character =
         * 'a'; // int test; boolean boolValue = true; byte byteNum = 127;
         * System.out.println(String.format("%c %f %b",character,floatNum,boolValue));
         * 
         * // strings String firstName = "Abhijeet"; String lastName = "mallick";
         * System.out.println(firstName + " " + lastName);
         * 
         * // while loop while(num > 10){ // System.out.println(num); num-=1; }
         * 
         * // for loop for(int i =0;i<5;i++){ System.out.printf("%d\n",i); }
         * 
         * // if else int n= 5; while(n < 10){ n++;
         * System.out.println("'i run everytime'"); if (n==8){ break; }else if(n==5){
         * continue; }else{ System.out.println(n); }
         * 
         * }
         * 
         * // user input Scanner input = new Scanner(System.in);
         * System.out.println("Enter your name"); String user = input.nextLine(); int
         * num = input.nextInt(); System.out.println(user+num); int value ; do{
         * System.out.println("Enter a value"); value = input.nextInt(); }while(value !=
         * 5); System.out.println(value + " Great :D"); // Switch String s =
         * input.nextLine(); switch(s){ case "abc": System.out.println("ok"); break;
         * case "bca": System.out.println("ko"); break; default:
         * System.out.println("okko"); }
         * 
         * 
         * // Arrays String[] arr; arr = new String[3]; arr[0] = "Bmx"; arr[1] = "car";
         * // System.out.println(arr[0]); // System.out.println(arr[2]); int[] values =
         * {1,2,3,4,5,7,8}; // System.out.println(values); for (String i : arr){
         * System.out.println(i); } for(int i = 0 ; i < values.length ; i++){
         * System.out.println(values[i]); }
         * 
         * // multi - dimensional array String[][] arr = { {"A","B"}, {"a"}, {} }; //
         * System.out.println(arr[2]);
         * 
         * int[][] values = new int[2][3]; values[0][1] = 5;
         * System.out.println(values[0][1]);
         * 
         * int[][] x ; x =new int[][]{ {1,2,3}, {3,4}, {32,32} };
         * System.out.println(x[2][1]); Scanner scanner = new Scanner(System.in);
         * String[] s = scanner.nextLine().split(""); for(String i : s){
         * System.out.println(i); }
         * 
         * Scanner scanner = new Scanner(System.in); int num = scanner.nextInt(); int[]
         * arr = new int[num]; for(int i = 0 ; i < num ;i++){ arr[i] =
         * scanner.nextInt(); } for(int i : arr){ System.out.print(i+" "); }
         * 
         * String[] arr = new String[1]; arr[0] = "okay";
         * System.out.println(arr.length); System.out.println(arr[0]);
         */
        // close input stream
        // input.close();ss
    }
}
