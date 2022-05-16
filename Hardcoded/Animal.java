// with file name Animal.java

// does not compile

public class Animal{
	private String name;
}
public class Animal2{
}


// compiled
/*
public class Animal{
	private String name;
}
class Animal2{
}
*/

// compiled
/*
public class Animal{
	String name;
}
class Animal2{
}
*/

// compiled
/*
class Animal{
	private String name;
}
class Animal2{
}
*/

// compiled
/*
class Animal{
	String name;
}
class Animal2{
	String name;
}
*/

// compiled
/*
public class Animal{
	String name;
}
*/

// compiled 
/*
class Animal{
	String name;
}

*/

// compiled 
/*
class Animal2{
	String name;
}
*/

// does not compile 
/*
public class Animal2{
	String name;
}
*/


