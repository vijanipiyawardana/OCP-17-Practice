public class WaterBottle {
    private String brand;
    private boolean empty;
    public static float code;
    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty = " + wb.empty);
        System.out.println("Brand = " + wb.brand);
        System.out.println("Code = " + code);
    }
}
/*
 * What lines are printed by the following program? (Choose all that apply.)
 *      A. Line 8 generates a compiler error.
        B. Line 9 generates a compiler error.
        C. Empty =
        D. Empty = false
        E. Brand =
        F. Brand = null
        G. Code = 0.0
        H. Code = 0f
    
    Answer: D, F, G

    Explaination:
    The code compiles and runs without issue, so options A and B are incorrect. A
    boolean field initializes to false, making option D correct with Empty = false being
    printed. Object references initialize to null, not the empty String, so option F is correct
    with Brand = null being printed. Finally, the default value of floating-­point numbers is
    0.0. Although float values can be declared with an f suffix, they are not printed with an f
    suffix. For these reasons, option G is correct and Code = 0.0 is printed.
 */
