public class LocalVariable {

    public static void main(String[] args) {

        /**
         * Final local variables
         * use final keyword - declaring constants
         * cannot change the value of a final local variable
         */
        final int y = 10;
        int x = 20;
        y = x + 10; // DOES NOT COMPILE

        /*
         * Final local variable reference
         * we can modify the content or data in the array, but
         * cannot change the value of the reference favoriteNumbers
         */
        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
        favoriteNumbers = null; // DOES NOT COMPILE

    }

    /**
     * Uninitilized local variables
     * Local variables do not have a default value and must be initialized before
     * use.
     */
    public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }

    /*
     * Here, z is declared but never used, so it is not required to be initialized
     */
    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // x is initialized here
        int z; // z is declared here but never initialized or used
        int reply = x + y;
        return reply;
    }

    /*
     * Passing Constructor and Method Parameters
     */
    /**
     * Good example for: Local variables must be initialized before it is used
     * - answer variable is initialized in both branches of if statement, so the
     * compiler knows
     * regardless of hether check is true or false, the answer will be set to
     * something before it is used.
     * - otherAnswer variable is not initialized but it is never used - legal
     * - onlyOneBranch variable is initialized only if check happens to be true.
     * The compiler knows there is the possibility for check to be false,
     * resulting in uninitialized code, and gives a compiler error.
     */
    public void findAnswer(boolean check) { // check is a method parameter
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

    /*
     * tries to use a variable that is not initialized
     */
    public void checkAnswer() {
        boolean value;
        findAnswer(value); // DOES NOT COMPILE
    }

}
