/*
 * When each object first becomes eligible for garbage collection?
*/
public class GarbageCollect {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;          // new String("a") is eligible for gc: reason 1
        String three = one;
        one = null;         
    }   // new String("b") is eligible for gc: reason 2
}
