public class Identifier{

/*
Energetic individual with 5+ yrs industry and academic experience. Dedicated, hardworking and enthusiastic towards contributing to research and development in the fields of HCI, NLP, AI and ML.
*/

	public static void main(String args[]){

		// valid identifiers

		// begin with a currency symbol
		int $dollar = 1000;
		int ¥yuan = 2000;
		int €euro = 3000;

		//begin with an underscore
		double _salary = 10000.00;
		double __bonus = 1000.00;

		//can include numbers
		int number1 = 10;
		int id2photo = 100;

		//capital letters in a researved word : java is case sensitive
		int DEFAULT = 350;
		int Default = 250;
		int dEfault = 150;


		// invalid identifiers 
		
		// start with a number
		int 2number = 2;

		//only one underscore
		float _ = 1f;

		//reserved word (in java 50 researved words)
		int default = 300;
		float public = 110;	

		//any other special charactors
		int post@code = 12500;
		int go*to = 335;
		String _*$coffee = "drink";


		System.out.println($dollar + " " + ¥yuan + " " + €euro);
		System.out.println(_salary);
		System.out.println(number1 + " " + id2photo);
	}
}
