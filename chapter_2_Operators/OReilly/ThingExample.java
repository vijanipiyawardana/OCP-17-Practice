class Thing {

    private int data;

    public Thing(int data) {
        this.data = data;
    }

}

public class ThingExample {
    public static void main(String[] args) {
        Thing t1 = new Thing(100);
        Thing t2 = new Thing(100);
        Thing t3 = new Thing(99);

        System.out.println(t1); // prints Thing@251a69d7
        System.out.println(t2); // prints Thing@7344699f
        System.out.println(t3); // prints Thing@6b95977

        // compares object reference expressions
        System.out.println(t1 == t2);   // false
        System.out.println(t1 == t3);   // false
    }
}
