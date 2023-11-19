/**
 * Calling methods that throw exceptions
 */

class NoMoreCarrotsException extends Exception {}

public class Bunny1 {

    /**
     * Calling eatCarrot() attempt 1: DOES NOT COMPILE 
     * Bunny.java:13: error: unreported exception NoMoreCarrotsException; must be caught or declared to be thrown
        eatCarrot();
     *
     * NoMoreCarrotsException is a Checked exception, so must be handled or declared.
     */
    // public static void main(String[] args) {
    //     eatCarrot(); // COMPILE ERROR
    // }


    /**
     * Calling eatCarrot() attempt 2: CORRECT
     * 
     */
    // public static void main(String[] args) throws NoMoreCarrotsException {
    //     eatCarrot();
    // }
    
   /**
     * Calling eatCarrot() attempt 3: CORRECT
     * 
     */
    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {
            System.out.println("Sad rabbit");
        }
    }



    /**
     * This method
     * @throws NoMoreCarrotsException
     * 
     * eatCarrot() method didn't throw an exception, it just declared that it could.
     * this is enough for the compiler to require the caller to handle or declare the exception.
     * 
     * Declaring an unused exception is not considered unreachable code.
     * It gives the method the option to change the implementation to throw that exception in the future.
     */
    private static void eatCarrot() throws NoMoreCarrotsException {}
}
