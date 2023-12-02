package com.UserDefindMethods;

public class MethodExample4 {
	
	private void Multiplication()
	{
		
		int Var1=50;
		int Var2=90;
		int Var3;
		
		Var3=Var1*Var2;
		System.out.println("The Value of the variable Var3 after Multiplication is -"+Var3);
	}
	
	public static void main(String[] args) {
		
		
		 MethodExample4 m3=new MethodExample4();
		 m3.Multiplication();
		 
		 System.out.println();
		 m3.Multiplication();
		 
		 //multiplication method is a Private Method the private Method cannot be accessed from other different class
		 //	Private Methods can be accessed in the same class in which they are created and can be accessed for any 
		 //number of times within the class
		 //MethodExample2 class Addition User Defind Method is requied in MethodExample4
		 //Creating an object for Another class in the Current Class Which contains Addition Method
		 
		 
		 
	}
}
