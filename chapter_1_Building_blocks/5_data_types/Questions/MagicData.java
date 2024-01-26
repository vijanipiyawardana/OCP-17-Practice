public class MagicData {
    public void printMagicData() {
        var magic = 3_1;
        System.out.println(magic);
    }
}
/**
 *  Which of the following expressions, when inserted independently into the blank line, allow
 *  the code to compile? (Choose all that apply.)
 * 
 *  A. 3_1              // correct
 *  B. 1_329_.0         // incorrect
 *  C. 3_13.0_          // incorrect
 *  D. 5_291._2         // incorrect
 *  E. 2_234.0_0        // correct
 *  F. 9___6            // correct
 *  G. _1_3_5_0         // incorrect
 * 
 *  Answer: A, E, F
 * 
 *  Explaination:
 *      An underscore (_) can be placed in any numeric literal, as long as it is not at the
        beginning, at the end, or next to a decimal point (.). Underscores can even be placed next to
        each other. For these reasons, options A, E, and F are correct. Options B and D are incorrect
        as the underscore (_) is next to a decimal point (.). Options C and G are incorrect because
        an underscore (_) cannot be placed at the beginning or end of the literal.
 * 
 */
