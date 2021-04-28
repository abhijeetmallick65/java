public abstract class Machine{
    private int id;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        System.out.println(id);
        return this.id;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void test();
    public void run(){
        start();
        stop();
    }
}