import java.io.IOException;

public class Demo {

    /**
     * CHECKED EXCEPTION
     * 
     * How to declare an exception:
     * 
     * throw keyword:
     *      says to Java, you want to throw a new Exception or rethrow an existing exception.
     *      used as a statement inside a code block.
     * throws keyword:
     *      declares that the method might throw an Exception, also might not.
     *      indicates what Exception it supports.
     *      used only at the end of a method declaration.  
     * 
     * Compile error: Unhandled exception type IOException
     * error: unreported exception IOException; must be caught or declared to be thrown
     * 
     */
    // void fall(int distance) throws IOException {
    //     if (distance > 10) {
    //         throw new IOException();
    //     }
    // }

    /**
     * CHECKED EXCEPTION
     * 
     * How to handle the exception:
     * 
     * Alternate vertion of fall()
     * 
     * java.io.IOException
        at Demo.fall(Demo.java:33)
        at Demo.main(Demo.java:42)
     */
    // void fall(int distance) {
    //     try {
    //         if(distance > 10) {
    //             throw new IOException();
    //         } 
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }


    /**
     * UNCHECKED EXCEPTION
     * 
     * Runtime exception:
     * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "<parameter1>" is null
        at Demo.fall(Demo.java:53)
        at Demo.main(Demo.java:59)
     * 
     */
    void fall(String input) {
        System.out.println(input.toLowerCase());
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        // d.fall(80);  
        d.fall(null);
    }
}
