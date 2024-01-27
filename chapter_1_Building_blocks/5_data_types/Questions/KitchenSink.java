public class KitchenSink {
    private int numForks;

    public static void main(String[] args) {
        int numKnives;
        System.out.println("""
            "# forks = " + numForks +
             " # knives = " + numKnives +
            # cups = 0""";);
    }
}
/**
 *  Which are true about this code? (Choose all that apply.)
 *      A.The output includes: # forks = 0.
        B.The output includes: # knives = 0.
        C.The output includes: # cups = 0.
        D.The output includes a blank line.
        E.The output includes one or more lines that begin with whitespace.
        F.The code does not compile.
 * 
 * Answer: C, E
 * 
 * Explaiination:
 *  The first thing to recognize is that this is a text block and the code inside the """ is
    just text. Options A and B are incorrect because the numForks and numKnives variables
    are not used. This is convenient since numKnives is not initialized and would not compile if
    it were referenced. Option C is correct as it is matching text. Option D is incorrect because
    the text block does not have a trailing blank line. Finally, option E is also an answer since
    " # knives is indented.
 */
