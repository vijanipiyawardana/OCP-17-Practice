public class Blocky {
    public static void main(String[] args) {
        var blocky = """
            squirrel \s
            pigeon \
            termite""";
        System.out.println(blocky);
    }
}
/**
 * Which are true about this code? (Choose all that apply.)
 * 
 *      A. It outputs two lines.
        B. It outputs three lines.
        C. It outputs four lines.
        D. There is one line with trailing whitespace.
        E. There are two lines with trailing whitespace.
        F. If we indented each line five characters, it would change the output.

    Answer: A, D

    Explaination:
        Option A is correct. There are two lines. One starts with squirrel, and the other
        starts with pigeon. Remember that a backslash means to skip the line break. Option D
        is also correct as \s means to keep whitespace. In a text block, incidental indentation is
        ignored, making option F incorrect.
 */