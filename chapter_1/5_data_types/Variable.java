public class Variable{

	int i1, i2, i3 = 1;

	public static void main(String args[]){
		new Variable().printVar();	
	}

	void printVar(){	
		System.out.println(i1 + " " + i2 + " " + i3);		
	}
}
