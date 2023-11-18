public class Literals {
    public static void main(String[] args) {
        // writing literals, the number/value is the literal
		//long max = 3123456789; 	// DOES NOT COMPILE. Compile error: integer number too large
		long max = 3123456789L; 	// Compiled, now Java knows it is long because of L.

		// differenct base numbers
		int octalNum = 017;
		int hexaNum = 0XFf;
		int binaryNum = 0B10;
		System.out.println("\nDifferent base numbers...");
		System.out.println(" Hexa is: " + hexaNum); 	// prints 255 which is decimal equivalant
		System.out.println(" Octal is: " + octalNum); 	// prints 15 which is decimal equivalant
		System.out.println(" Binary is: " + binaryNum); 	// prints 2 which is decimal equivalant

		// Literals and underscore
		int million1 = 1000000;
		int million2 = 1_000_000; // makes easier to read with underscore

		// double notAtStart = _1000.00; 		// DOES NOT COMPILE. ';' expected.
		// double notAtEnd = 1000.00_;		// DOES NOT COMPILE. Illegal underscore.
		// double notBeforeDecimal = 1000_.00;	// DOES NOT COMPILE. Illegal underscore.
		// double notAfterDecimal = 1000._00;	// DOES NOT COMPILE. Illegal underscore.
		// double annoyingButLegal = 1_00_0.0_0;	// Ugly, but Compiles
		// double reallyUgly = 1___________2;	// Compiles
    }
}
