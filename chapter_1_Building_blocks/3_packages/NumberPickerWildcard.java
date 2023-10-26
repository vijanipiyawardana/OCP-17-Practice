/**
 * Here, * is the wildcard that matches all classes in package java.util
 */
import java.util.*; // imports java.util.Random among other things
public class NumberPickerWildcard {
    public static void main(String args[]) {
        Random r = new Random(); 
        System.out.println(r.nextInt(10)); // a number 0-9
    }
}
