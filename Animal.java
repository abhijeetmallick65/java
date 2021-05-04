public enum Animal {
    CAT("ferry"), DOG("jerry"), MOUSE("terry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "This animal is called : " + name;
    }
}
