public class VarKeyword {

    var tricky = "Hello"; // 2. DOES NOT COMPILE: instance variable

    /*
     * 1. local variable: can use var
     */
    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    /*
     * 3. type inference:
     * When you type var, you are instructing the compiler to determine the type for
     * you.
     * The compiler looks at the line of the declaration and uses it to infer the
     * type.
     */
    public void reassignment() {
        var number = 7;
        number = 4;
        number = "five"; // DOES NOT COMPILE
    }

    /***
     * 4. assume a variable declaration statement is completed in a single line
     * could insert a line break between the variable name and its initialization
     * value
     */
    public void breakingDeclaration() {
        var silly 
                = 1;
    }

    /*
     * 4, 5. local variable type inference
     * the initial value used to determine the type needs to be part of the same statement.
     */
    public void doesThisCompile(boolean check) {
        var question;   // DOES NOT COMPILE
        question = 1;
        var answer;     // DOES NOT COMPILE
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }

    /*
     * 6, All the types declared on a single line must be the same type and share the same declaration.
     * 7. null is not allowed for var. (null can be any Object)
     *      While a var cannot be initialized with a null value without a type, it can
            be reassigned a null value after it is declared, provided that the under-
            lying data type is a reference type.
     */
    public void twoTypes() {
        int a, var b = 3;   // DOES NOT COMPILE
        var n = null;       // DOES NOT COMPILE
    }

    /*
     * 8. a and b are method parameters.
     * var is only used for local variable type inference
     */
    public int addition(var a, var b) { // DOES NOT COMPILE
        return a + b;
    }

    /* 
     * 9. look at Var.java
     */
}
