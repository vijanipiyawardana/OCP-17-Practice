/**
 * Adding import statement
 * Compiled successfully
 */
import java.util.Random; // import tells us where to find Random
public class NumberPickerCorrect {
    public static void main(String args[]) {
        Random r = new Random(); 
        System.out.println(r.nextInt(10)); // a number 0-9
    }
}
