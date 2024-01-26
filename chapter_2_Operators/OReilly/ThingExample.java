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

        System.out.println(t1.equals(t2));  // false
        System.out.println(t1.equals(t3));  // false

        int x = 99;
        int y = x;
        System.out.println(x);  // 99
        System.out.println(y);  // 99
        y = 100;
        System.out.println(x);  // 99
        System.out.println(y);  // 100

        // Using String
        String s1 = "Hello";
        String s2 = s1; 
        System.out.println(s1); // Hello
        System.out.println(s2); // Hello

        // we didn't change s2, but created a new Stirng in memory, 
        // reference variable s2 still points to the original object.
        s2.concat(" world!");   
        System.out.println(s1); // Hello
        System.out.println(s2); // Hello

        // we override s2 reference variable to refer to the newly created object, 
        s2 = s2.concat(" world!");   
        System.out.println(s1); // Hello
        System.out.println(s2); // Hello world!

                // Aliasing
                
        // Using StringBuilder
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1;
        System.out.println(sb1);    // Hello
        System.out.println(sb2);    // Hello

        // both sb1 and sb2 has changed
        sb1.append(" world!");
        System.out.println(sb1);    // Hello world!
        System.out.println(sb2);    // Hello world!

    }
}
