package com.UserDefindMethods;

public class MethodExample2 {
	
	
	private void addition() 
	{
		
		
		System.out.println("Renuka is a Performance TestEngineer");
	}
		public static void main(String[]arg) {
			int Var1=30;
			int Var2=50;
			int Var3;
			
			Var3=Var1+Var2;
			
			MethodExample2 Laxmi=new MethodExample2();
			Laxmi.addition();
			Laxmi.Subtraction();
		
			
			System.out.println("The value of the variable var3 after adittion is -" + Var3);
		
			
    System.out.println("********Adittion**********");
		}
    public void Subtraction()
	 {
		 int Var1=30;
			int Var2=50;
			int Var3;
			Var3=Var1-Var2;
			System.out.println("The Value of the variable Var3 after Subtraction is -"+Var3);
			}
   
}
