public class Mechanic {

    private String name = "Machine";
<<<<<<< HEAD
    protected int age = 90;
    protected boolean b = true;

    public void start() {
=======
    public int age;
    protected boolean b= true;

    public Mechanic(){
        System.out.println("this is a default constructor");
    }
    Mechanic(int n){
        this.age = n;
    }
    public void start(){
>>>>>>> 3f73db5bd218a557ef60471b6e48d0833c35b308
        System.out.println("Machine started ");
    }

    public void stop() {
        System.out.println("Machine Stopped !");
    }
<<<<<<< HEAD
}

class z extends Mechanic {
    public void ageSum(int num) {
        age = age + num;
        System.out.println(age);
=======
    public void getAge(){
        System.out.println(this.age + " this is age .");
>>>>>>> 3f73db5bd218a557ef60471b6e48d0833c35b308
    }
}