public class Demo {
    public static void main(String[] args) {
        short numPets = 5L;         // line 3
        int numGrains = 2.0;        // line 4
        String name = "Scruffy";    // line 5
        int d = numPets.length();   // line 6
        int e = numGrains.length;   // line 7
        int f = name.length();      // line 8
    }
}
/**
 * Which of the following statements about the code snippet are true? (Choose all that apply.)
 *      A. Line 3 generates a compile error.
 *      B. Line 4 generates a compile error.
 *      C. Line 5 generates a compile error.
 *      D. Line 6 generates a compile error.
 *      E. Line 7 generates a compile error.
 *      F. Line 8 generates a compile error.
 * 
 * Answer: A, B, D, E
 * 
 * Explaination:
 *  Line 3 does not compile because the L suffix makes the literal value a long,
    which cannot be stored inside a short directly, making option A correct. Line 4 does not
    compile because int is an integral type, but 2.0 is a double literal value, making option B
    correct. Line 5 compiles without issue. Lines 6 and 7 do not compile because numPets and
    numGrains are both primitives, and you can call methods only on reference types, not prim-
    itive values, making options D and E correct, respectively. Finally, line 8 compiles because
    there is a length() method defined on String.
 */
