public class PrimitiveType
{
	public static void main(String args[]){

		// Primitive types. Default value is assigned. 
		boolean myBoolean = false; 	// true or false. bit size depends on the JVM. No min or max value defined. 
		byte myByte = 0; 	// 8 bit integral value. The range -128 to 127.
		short myShort = 0; 	// 16 bit integral value. The range -32,768 to 32,767.
		int myInt = 0; 		// 32 bit integral value. The range -2,147,483,648 to 2,147,483,647.
		long myLong = 0L; 	// 64 bit integral value. The range - 2(to the power 63) to 2(to the power 63) - 1. Example 123l or 123L
		float myFloat = 0.0f; 		// 32 bit floating-point value. No min or max value defined. Example 123.45f of 123.45F
		double myDouble = 0.0; 		// 64 bit floating-point value. No min or max value defined. Example 123.456
		char myChar = '\u0000'; 	//this value is null. 16 bit unicode value. The range 0 to 65535. Example 'a'

		// print default values
		System.out.println("\nDefault values of Primitive types...");
		System.out.println(" boolean: " + myBoolean + 
					"\n byte: " + myByte +
					"\n short: " + myShort +
					"\n int: " + myInt + 
					"\n long: " + myLong +
					"\n float: " + myFloat +
					"\n double: " + myDouble +
					"\n char: " + myChar); 	
	}

}
