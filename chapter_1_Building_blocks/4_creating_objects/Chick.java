// class definition : code block
public class Chick {

	int numEggs = 12; // initialize on line
	int numLegs; // instance variable
	String name;

	// Constructor
	public Chick(){
		name = "Dick"; // initialize in constructor
		System.out.println("Inside Chick constructor");
	}

	// Main method declaration : code block
	public static void main(String args[]){
		Chick chick = new Chick();
		System.out.println("Eggs : " + chick.numEggs + ", Name :" + chick.name + ", Legs : " + chick.numLegs);
		chick.numLegs = 2; // set variable
		System.out.println("Eggs : " + chick.numEggs + ", Name :" + chick.name + ", Legs : " + chick.numLegs);

		// Inner block : code block
		{
			System.out.println("Feathers inside inner block");
		}	
	}

	// Instance initializer : code block
	{
		System.out.println("Wings inside instance initializer");
	}
}
