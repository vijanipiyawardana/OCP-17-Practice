/**
Which of the following are legal entry point methods that can be run from the command
line? (Choose all that apply.)
        A.private static void main(String[] args)   --> Compiled successfully. Runtime error: Main method not found. please define the main method as: public static void main(String[] args)
        B.public static final main(String[] args)   --> Compile error: Return type is missing
        C.public void main(String[] args)           --> Compiled successfully. Runtime error: Main method is not static.
        D.public static final void main(String[] args) --> Correct. Compile and run successfully.
        E.public static void main(String[] args)    --> Correct. Compile and run successfully.
        F.public static main(String[] args)         --> Compile error: invalid method declaration; return type required

    Correct answers: D, E

    Explaination: 
        Option E is the canonical main() method signature. You need to memorize it.
        Option D is an alternate form with the redundant final. Option A is incorrect because the
        main() method must be public. Options B and F are incorrect because the main() method
        must have a void return type. Option C is incorrect because the main() method must
        be static.
 */

public class Q1MainMethod {

    public static void main(String[] args) {
        System.out.println("Inside Main Method");
    }
}
