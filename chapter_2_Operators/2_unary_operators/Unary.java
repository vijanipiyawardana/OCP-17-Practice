public class Unary {
    public static void main(String[] args) {

        /**
         * Complement and Negation Operators
         */

        // logical complement operator !
        // flips the value of a boolean expression
        boolean isAnimalAsleep = false;
        System.out.print(isAnimalAsleep); // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.print(isAnimalAsleep); // true

        // bitwise complement operator ~
        // flips all of the 0s and 1s in a number.
        // to find the bitwise complement of a number, multiply it by
        // negative one and then subtract one
        int value = 3; // 0011
        int complement = ~value; // 1100
        System.out.println(value); // 3
        System.out.println(complement); // -4
        System.out.println(-1 * value - 1); // -4
        System.out.println(-1 * complement - 1); // 3

        // negation operator -
        // reverses the sign of a numeric expression
        double zooTemperature = 1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); // -­1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); // -1.21

        // some operators require the variable or expression
        // they’re acting on to be of a specific type
        int pelican = !5; // DOES NOT COMPILE
        boolean penguin = -true; // DOES NOT COMPILE
        boolean peacock = !0; // DOES NOT COMPILE

        /*
         * Increment and Decrement Operators
         */

        int parkAttendance = 0;
        System.out.println(parkAttendance);     // 0
        System.out.println(++parkAttendance);   // 1
        System.out.println(parkAttendance);     // 1
        System.out.println(parkAttendance--);   // 1
        System.out.println(parkAttendance);     // 0

    }
}
