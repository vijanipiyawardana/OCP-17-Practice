public class TextBlock{

	public static void main(String args[]){

		int ant;
		int aNt;

		// String with escape characters \n and \ does work, but this is hard to read.
		String eyeTest = "\"Java Study Guide\"\n  by Scott & Jeanne";

		System.out.println(eyeTest);

		// Java Text Block also known as Multiline Strings
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

		String pyramid2 = """
		  *
		 * *
		* * *
		""";
		
		System.out.println(pyramid2);

		// Text block formatting
		
		// Text block require a line break after opening """
		// String block1 = """doe"""; // DOES NOT COMPILE

		// One line text block. \ tells Java not to add a new line before deer.
		String block2 = """
			doe \
			deer""";

		System.out.println(block2); // doe deer

		// Four line text block. \n tells a new line and closes the text block in a 
		// seperate line """
		String block3 = """
			doe \n
			deer
			""";

		System.out.println(block3); // prints a new line between doe and deer

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





