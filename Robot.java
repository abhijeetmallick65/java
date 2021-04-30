public class Robot {
    private int i ;
    String name = "Robot ";
    public Robot(int i){
        this.i = i;
    }
    // non static
    private class Brain{
        public void think(){
            System.out.println("this is a brain "  + i);
        }
    } 
public class check{public void s(){System.out.println("s");}}
    // static 
    public static class Battery{
        public void charge(){
            System.out.println("Battery charging");
        }
    }
    public void start(){
        // nested class
        Brain brain = new Brain();
        brain.think();
        class Temp{
            public void tempo(){
                System.out.println(name);
            }
        }
        Temp t = new Temp();
        t.tempo();
    }
    
}
