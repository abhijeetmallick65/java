package plant;

// public class Field {
//     Plant p= new Plant();
//     public Field(){
//         System.out.println(p.age);
//     }
//      public static void main(String[] args) {
//         Inner inner = new Inner(6);
//         System.out.println(inner.c);
//         System.out.println(inner.check);
//     }
// }
public class Field extends Inner{
    
    public int i = 10;
    private int y = 10;
    protected int j = 10;
    int io = 10;
    public Field(int i) {
        super(i);
    }
}