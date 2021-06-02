public class CarTEST {
    private String name;

    public void start() {
        System.out.println("Car started");
    }

    public CarTEST(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
