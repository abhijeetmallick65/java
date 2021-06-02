public class Mechanic{

    private String name = "Machine";
    public int age;
    protected boolean b= true;

    public Mechanic(){
        System.out.println("this is a default constructor");
    }
    Mechanic(int n){
        this.age = n;
    }
    public void start(){
        System.out.println("Machine started ");
    }
    public void stop(){
        System.out.println("Machine Stopped !");
    }
    public void getAge(){
        System.out.println(this.age + " this is age .");
    }
}