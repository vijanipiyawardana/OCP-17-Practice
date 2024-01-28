public class Var1 {
    void check() {
        var spring = null;      // A: not legal: cannot infer type for local variable spring
        var fall = "leaves";    // B: legal
        var evening = 2; evening = null; // C: not legal: incompatible types: <null> cannot be converted to int
        var night = Integer.valueOf(3);     // D: legal
        var day = 1/0;                      // E: legal
        var winter = 12, gold;      // F: not legal: 'var' is not allowed in a compound declaration
        var fall = 2, autumn = 2;   // G: not legal: 'var' is not allowed in a compound declaration
        var morning = ""; morning = null;   // H: legal

    }
}
/* Which of the following code snippets about var compile without issue when used in a
   method? (Choose all that apply.)
   
 * Answer: B, D, E, H
 * 
 * Explaination:
 *  A var cannot be initialized with a null value without a type, but it can be
    assigned a null value later if the underlying type is not a primitive. For these reasons, 
    option H is correct, but options A and C are incorrect. Options B and D are correct as the 
    underlying types are String and Integer, respectively. Option E is correct as this is a valid
    numeric expression. You might know that dividing by zero produces a runtime exception, but
    the question was only about whether the code compiled. Finally, options F and G are incor-
    rect as var cannot be used in a multiple-­variable assignment.
 */
