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
 */

public class Q1MainMethod {

    public static void main(String[] args) {
        System.out.println("Inside Main Method");
    }
}
