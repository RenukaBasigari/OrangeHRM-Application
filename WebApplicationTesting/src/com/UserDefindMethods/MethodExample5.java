package com.UserDefindMethods;

public class MethodExample5 {
	
	private void division()
	{
		
		int Var1=50;
		int Var2=90;
		int Var3;
		
		Var3=Var1/Var2;
		System.out.println("The Value of the variable Var3 after division is -"+Var3);	
		
	
	}
	
	public static void main(String[] args) {
		 MethodExample3 m2=new MethodExample3();
		 
		 System.out.println("*****Addition Method********");
		 
		 m2.Addition();
		 
		 MethodExample4 m3=new MethodExample4();
		// m3.Multiplication();
		 
		 //Multiplication Method is a Private Method the private methods can not be accesssed from other different class
		 
		MethodExample5 m5=new MethodExample5();
		System.out.println("******Division Method******");
		m5.division();
		System.out.println();
	}
}
