package com.farm;

// class definition : code block
public class Egg{

	// initialize on line
	private int number = 3;
	
	// constructor : code block
	public Egg(){
		number = 5; // initialize in Constructor	
	}

	// Main method declaration : code block
	public static void main(String args[]){
		Egg egg = new Egg(); // Creating Egg object
		egg.number = 6; // set variable
		System.out.println(egg.number); // prints 6
	}

	// instance initializer : code block
	{ number = 4; }
}
