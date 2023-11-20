public class Frog {
    
    /**
     * 4. NullPointerException
     * 
     * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "<parameter1>" is null
        at Frog.hop(Frog.java:12)
        at Frog.main(Frog.java:16)
     * 
     */
    public void hop(String name, Integer jump) {
        System.out.println(name.toLowerCase() + " " + jump.intValue());
    }

    public static void main(String[] args) {
        // new Frog().hop(null, 1);
        new Frog().hop("Kermit", null);
    }

    /**
     * For line 17:
     * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "<parameter2>" is null
        at Frog.hop(Frog.java:12)
        at Frog.main(Frog.java:17)
     */

     /**
      * want the actual variable name to be shown, compile the code
      * with the -­g:vars flag, which adds debug info.
      *
      * javac -d build Frog.java -g:vars
      * java -cp build Frog
      *
      * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "jump" is null
      */
}
