public class BinaryArithmetic {
    public static void main(String[] args) {

        /*
         * multiplicative operators (*, /, %) have a higher order of precedence 
         * than the additive operators (+, -­)
         */
        int price = 2 * 5 + 3 * 4 - 8;
        System.out.println(price);  // 14

        /*
         * adding parentheses
         * can change the order of operation explicitly by wrapping parentheses 
         * around the sections you want evaluated first
         */
        int price = 2 * ((5 + 3) * 4 - 8);
        System.out.println(price);  // 48

        /*
         * verifying parentheses syntax
         * make sure they are always valid and balanced
         */
        long pigeon = 1 + ((3 * 5) / 3;         // DOES NOT COMPILE
        int blueJay = (9 + 2) + 3) / (2 * 4;    // DOES NOT COMPILE
        short robin = 3 + [(4 * 2) + 4];        // DOES NOT COMPILE: does not allow [] 
        short robin = 3 + ((4 * 2) + 4);        // 15

        /*
         * Division and Modulus (Remainder) Operators
         * For a given divisor y, the modulus operation results in a value 
         * between 0 and (y -­ 1) for positive dividends, or 0, 1, 2 in this example.
         */
        System.out.println(9 / 3);  // 3
        System.out.println(9 % 3);  // 0

        System.out.println(10 / 3); // 3
        System.out.println(10 % 3); // 1
        
        System.out.println(11 / 3); // 3
        System.out.println(11 % 3); // 2

        System.out.println(12 / 3); // 4
        System.out.println(12 % 3); // 0

        /*
         * numeric promotion
         */
        // What is the data type of x * y?  long, apply rule 1
        int x = 1;
        long y = 33;
        var z = x * y;

        // What is the data type of x + y?  double if no compile error, apply rule 1
        double x = 39.21;
        float y = 2.1;      // DOES NOT COMPILE: missing f/F
        var z = x + y;

        // What is the data type of x * y? int, apply rule 3
        short x = 10;
        short y = 3;
        var z = x * y;

        // What is the data type of w * x / y? double, apply rule 3,2,1
        short w = 14;
        float x = 13;       // 13 is taken as an int, int can be put into a float variable
        double y = 30;
        var z = w * x / y;


    }
}
