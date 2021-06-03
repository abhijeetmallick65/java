public class Mechanic {

    private String name = "Machine";
    protected int age = 90;
    protected boolean b = true;

    public void start() {
        System.out.println("Machine started ");
    }

    public void stop() {
        System.out.println("Machine Stopped !");
    }
}

class z extends Mechanic {
    public void ageSum(int num) {
        age = age + num;
        System.out.println(age);
    }
}