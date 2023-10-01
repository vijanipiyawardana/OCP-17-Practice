/**
 * Compile error
 * error: cannot find symbol
        Random r = new Random();
        ^
 * error: cannot find symbol
        Random r = new Random();
                       ^
 */
public class NumberPickerError {
    public static void main(String args[]) {
        Random r = new Random(); // DOES NOT COMPILE
        System.out.println(r.nextInt(10));
    }
}