public class TextBlock{

	public static void main(String args[]) {

		// String with escape characters \n and \ does work, but this is hard to read.
		String eyeTest = "\"Java Study Guide\"\n  by Scott & Jeanne";

		System.out.println(eyeTest);

		// Use Java Text Block also known as Multiline Strings
		String textBlock = """ 
			"Java Study Guide" 		 
				by Scott & Jeanne 	  
			""";
	
		System.out.println(textBlock);
		// Incidental whitespace in line 12: to make the code easier to read. 
		// Essential whitespace in line 13: important.

		String pyramid = """
		          *
		         * *
		        * * *
			""";
		
		System.out.println(pyramid);

		/**
		 * in pyramid2:- 
		 * 		there are 4 lines of output: 29-31 has stars, 32 a line without any character.
		 * 		there are no identical whitespace characters here.
		 * 		line 29 has 2 essencial whitespace characters
		 * 		line 30 has 1 essencial whitespace character
		 */

		String pyramid2 = """
		  *
		 * *
		* * *
		""";
		
		System.out.println(pyramid2);


		// ----------------------- Text block formatting ---------------------------
		
		// 1. Text block require a line break after opening """
		// String block1 = """doe"""; // DOES NOT COMPILE

		// 2. One line text block. \ tells Java not to add a new line before deer.
		String block2 = """
			doe \
			deer""";

		System.out.println(block2); // doe deer

		// 3. Four line text block. 
		// text block has the closing """ on a separate line -> 3 lines for the text block
		// and an explicit \n tells a new line 
		String block3 = """
			doe \n
			deer
			""";

		System.out.println(block3); // prints a new line between doe and deer

		// 4. All \" escapes the "
		// There is 1 space of essential whitespace on the doe and deer lines.
		String block4 = """
			"doe\"\"\"
			\"deer\"""		
			""";

		System.out.println(block4);
		// output:
		// 	"doe"""
		// 	"deer"""

		System.out.println("*" + block4 + "*");
		// output:
		// 	*"doe"""
		// 	"deer"""
		//	*
		
	}
}





