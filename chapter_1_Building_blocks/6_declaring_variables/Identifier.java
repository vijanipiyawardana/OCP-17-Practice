public class Identifier{

	public static void main(String args[]){

		// ------------------- legal identifiers

		// begin with a currency symbol
		int $dollar = 1000;
		int ¥yuan = 2000;
		int €euro = 3000;

		// begin with an underscore
		double _salary = 10000.00;
		double __bonus = 1000.00;

		// can include numbers, but not begin with a number
		int number1 = 10;
		int id2photo = 100;

		// capital letters in a researved word : java is case sensitive
		int DEFAULT = 350;
		int Default = 250;
		int dEfault = 150;


		// ------------------- not legal identifiers 
		
		// start with a number
		int 2number = 2;

		// only one underscore
		float _ = 1f;

		// reserved word (in java 50 researved words)
		int default = 300;
		float public = 110;	

		// any other special charactors
		int post@code = 12500;
		int go*to = 335;
		String _*$coffee = "drink";


		System.out.println($dollar + " " + ¥yuan + " " + €euro);
		System.out.println(_salary);
		System.out.println(number1 + " " + id2photo);


		// more examples
		long okidentifier;				// legal
		float $OK2Identifier;			// legal
		boolean _alsoOK1d3ntifi3r;		// legal
		char __SStillOkbutKnotsonice$;	// legal
		int 3DPointClass;				// not legal: identifiers cannot begin with a number
		byte hollywood@vine; 			// not legal: @ is not a letter, digit, $ or _
		String *$coffee;				// not legal: * is not a letter, digit, $ or _
		double public;					// not legal: public is a reserved word
		short _;						// not legal: a single underscore is not allowed

	}
}
