public class Cast {
    public static void main(String[] args) {

        /*
         * Casting values
         */
        int fur = (int)5;
        int hair = (short) 2;
        String type = (String) "Bird";
        short tail = (short)(4 + 10);
        long feathers = 10(long);       // DOES NOT COMPILE

        /*
         * involve putting a larger value into a smaller data type
         */
        float egg = 2.0 / 9;            // DOES NOT COMPILE
        int tadpole = (int)5 * 2L;      // DOES NOT COMPILE
        short frog = 3 -2.0;            // DOES NOT COMPILE

        /*
         * Reviewing Primitive Assignments
         */
        int fish = 1.0; // DOES NOT COMPILE: 1.0 is double
        short bird = 1921222; // DOES NOT COMPILE: outside the range of short
        int mammal = 9f;    // DOES NOT COMPILE: float into int?
        long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE: int value, out of range, need l/L for a long value

        /*
         * Applying Casting: can fix 3 of above examples
         */
        int fish = (int)1.0;
        short bird = (short)1921222;    // stored as 20678 : overflow
        int mammal = (int)9f;

        long reptile = (long)192301398193810323;    // DOES NOT COMPILE
        // because the value is first interpreted as an int by the compiler
        // and is out of range.
        // The following fixes this code without requiring casting:
        long reptile = 192301398193810323L;

    }
    
}
