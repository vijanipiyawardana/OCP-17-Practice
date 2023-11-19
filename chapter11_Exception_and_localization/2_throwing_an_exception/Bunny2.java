
class NoMoreCarrotsException extends Exception {}

public class Bunny2 {

    public static void main(String[] args) {
        Bunny2 b2 = new Bunny2();
        b2.bad();
    }

    /**
     * Compile error:
     * Bunny2.java:17: error: exception NoMoreCarrotsException is never thrown in body of corresponding try statement
        } catch (NoMoreCarrotsException e) {    
     */
    public void bad() {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {    // DOES NOT COMPILE
            System.out.println("Sad rabbit");
        }
    }

    /**
     * Java know eatCarrot() can't throw a checked exception.
     * there is no way for the catch block in bad() to be reached.
     */
    private void eatCarrot() {}
    
}
