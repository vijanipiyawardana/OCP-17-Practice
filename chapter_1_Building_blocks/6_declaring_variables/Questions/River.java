public class River {
    int Depth = 1;
    float temp = 50.0;
    public void flow() {
        for (int i = 0; i < 1; i++) {
            int depth = 2;
            depth++;
            temp--;
        }
        System.out.println(depth);
        System.out.println(temp); 
    }
    public static void main(String... s) {
        new River().flow();
    }
}
/*
 * Which statements about the following class are true? (Choose all that apply.)
        * A.Line 3 generates a compiler error.
        * B.Line 6 generates a compiler error.
        * C.Line 7 generates a compiler error.
        * D.Line 10 generates a compiler error.
        * E.The program prints 3 on line 10.
        * F.The program prints 4 on line 10.
        * G.The program prints 50.0 on line 11.
        * H.The program prints 49.0 on line 11.

    Answer: A, D

    Explaination:
    The first compiler error is on line 3. The variable temp is declared as a float, but the
    assigned value is 50.0, which is a double without the F/f postfix. Since a double doesn’t
    fit inside a float, line 3 does not compile. Next, depth is declared inside the for loop and
    only has scope inside this loop. Therefore, reading the value on line 10 triggers a compiler
    error. For these reasons, options A and D are the correct answers.

 */