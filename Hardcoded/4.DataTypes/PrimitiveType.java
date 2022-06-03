public class PrimitiveType
{
	
	public static void main(String args[]){

		// Primitive types. Default value is assigned. 
		boolean myBoolean = false; 	// bit size depends on the JVM. No min or max value defined. 
		byte myByte = 0; 	// 8 bit. The range -128 to 127.
		short myShort = 0; 	// 16 bit. The range -32768 to 32767.
		int myInt = 0; 		// 32 bit. The range -2147483648 to 2147483647.
		long myLong = 0L; 	// 64 bit. The range - 2(to the power 63) to 2(to the power 63) - 1.
		float myFloat = 0.0f; 		// 32 bit. No min or max value defined. 
		double myDouble = 0.0; 		// 64 bit. No min or max value defined. 
		char myChar = '\u0000'; 	//this value is null. 16 bit unicode. The range 0 to 65535.

		// print default values
		System.out.println("Default values...");

		System.out.println("boolean: " + myBoolean + 
					" byte: " + myByte +
					" short: " + myShort +
					" int: " + myInt + 
					" long: " + myLong +
					" float: " + myFloat +
					" double: " + myDouble +
					" char: " + myChar); 	

		// writing literals
		//long max = 3123456789; 	// DOES NOT COMPILE. Compile error: integer number too large
		long max = 3123456789L; 	// Compiled, now Java knows it is long.

		// differenct base numbers
		int octalNum = 017;
		System.out.println("Octal is: " + octalNum); 	// prints 15 which is decimal equivalant
		int hexaNum = 0XFf;
		System.out.println("Hexa is: " + hexaNum); 	// prints 255 which is decimal equivalant
		int binaryNum = 0B10;
		System.out.println("Binary is: " + binaryNum); 	// prints 2 which is decimal equivalant

		// Literals and underscore
		int million1 = 1000000;
		int million2 = 1_000_000; // makes easier to read with underscore

		double notAtStart = _1000.00; 		// DOES NOT COMPILE. ';' expected.
		double notAtEnd = 1000.00_;		// DOES NOT COMPILE. Illegal underscore.
		double notBeforeDecimal = 1000_.00;	// DOES NOT COMPILE. Illegal underscore.
		double notAfterDecimal = 1000._00;	// DOES NOT COMPILE. Illegal underscore.
		double annoyingButLegal = 1_00_0.0_0;	// Ugly, but Compiles
		double reallyUgly = 1___________2;	// Compiles

		
	}

}
