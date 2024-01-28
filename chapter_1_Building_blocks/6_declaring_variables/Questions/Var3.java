public class Var3 {
    public static void main(String[] args) {
        var num1 = Long.parseLong("100");   
        var num2 = Long.valueOf("100");
        System.out.println(Long.max(num1, num2));
    }
}
/** Which are true about the following code? (Choose all that apply.)
 *      A.The output is 100.
        B.The output is 200.
        C.The code does not compile.
        D.num1 is a primitive.
        E.num2 is a primitive.
    
    Answer: A, D

    Explaination:
    The first two lines provide a way to convert a String into a number. The first is
    a long primitive and the second is a Long reference object, making option D one of the
    answers. The code is correct and the maximum is 100, which is option A.

 */
