/**
 * Two types of code that result in an exception
 */
public class Demo {
    public static void main(String[] args) {

        /**
         * 1.
         * OCP questions about exceptions can be hidden.
         * The question appear to be about something else.
         * 
         * Compile error:
         * xception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at Demo.main(Demo.java:10)
         */
        String[] animals = new String[0];
        System.out.println(animals[0]);


        /**
         * 2.
         * explicitely request Java to throw an exception.
         * 
         * // <--(i) can pass a String parameter with a message when creating an exception,
         * or you can pass no parameters and use the defaults.
         * 
         */
        //  throw new Exception();
        //  throw new Exception("Ow! I fell.");  // <--(i)
        //  throw new RuntimeException();
        //  throw new RuntimeException("Ow! I fell.");   // <--(i)


        /**
         * 
         * Exception is an object, can store in an object reference.
         *  instantiates an exception on one line and then throws on next line.
         */
        var e = new RuntimeException();
        throw e;

        /**
         * missing new keyword
         */
        throw RuntimeException(); // COMPILE ERROR


        /**
         * first line already throws an exception and next line can never be reached
         */
        try {
            throw new RuntimeException();
            throw new ArrayIndexOutOfBoundsException();  // COMPILE ERROR
        } catch (Exception e) {
            
        }


    }
}
