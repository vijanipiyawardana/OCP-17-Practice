
public class RuntimeExceptions {

    public static void main(String[] args) {
        RuntimeExceptions runtimeEx = new RuntimeExceptions();
        // System.out.println(runtimeEx.answer);
        // System.out.println(runtimeEx.countsOfMoose[-1]);
    }

    /**
     * 1. ArithmeticException
     * 
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
        at RuntimeExceptions.<init>(RuntimeExceptions.java:16)
        at RuntimeExceptions.main(RuntimeExceptions.java:5)
     */
    // int answer = 11 / 0;

    /**
     * 2. ArrayIndexOutOfBoundsException
     * 
     * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
        at RuntimeExceptions.main(RuntimeExceptions.java:7)
     */
    // int[] countsOfMoose = new int[3];


    /**
     * Compile error:
     * RuntimeExceptions.java:35: error: incompatible types: String cannot be converted to Integer
    Integer number = (Integer) type
     * 
     */
    // String type = "moose";
    // Integer number = (Integer) type;    // DOES NOT COMPILE

    /**
     * 3. ClassCastException
     * 
     * Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        at RuntimeExceptions.<init>(RuntimeExceptions.java:47)
        at RuntimeExceptions.main(RuntimeExceptions.java:5)
     * 
     */
    String type = "moose";
    Object obj = type;
    Integer number = (Integer) obj;


}
