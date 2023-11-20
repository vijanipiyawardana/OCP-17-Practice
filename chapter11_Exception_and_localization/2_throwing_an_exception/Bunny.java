/**
 * Print an exception
 */

public class Bunny {

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e + "\n");
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }

    /**
     * Output:
     * 
        java.lang.RuntimeException: cannot hop

        cannot hop

        java.lang.RuntimeException: cannot hop
                at Bunny.hop(Bunny.java:18)
                at Bunny.main(Bunny.java:9)
     */
}
