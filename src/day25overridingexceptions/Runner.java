package day25overridingexceptions;

public class Runner {

	public static void main(String[] args) {
	//Create an object whose data type is Animal, Constructor is Dog
	//Note: When you create an object, you may use "parent classes" as data type	
		//Object obj3 = new Dog();
	//Nore: If parent and childe classes have methods whose names are same.
	//	    look at the data types to understand which one will be called.
		
		//Note: If you use  "parent class" as data type, the class members in child class
		//      will be unaccessible.
		Animal obj = new Dog();
		
		// If you use "child class" as data type, the class members in child class
		//and in parent class will be accessible.
		Dog obj2 = new Dog();//birthyear , tail, name, height - drink(), bark(),

		
	}

}
