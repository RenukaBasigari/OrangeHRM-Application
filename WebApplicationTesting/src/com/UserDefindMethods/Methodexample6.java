package com.UserDefindMethods;

public class Methodexample6 {
	
	protected void division()
	{
		//Exception Handling 
	//Local Variables
		try {
			//Local Variables
			int var1=40;
			int var2=0;
			int var3;
			var3=var1/var2;
			System.out.println("The Value of the variable var3 after division is -"+ var3);
			
		} 
		catch (Exception divisionException) 
		{
			// TODO: handle exception
			//Exception 	Handling
			System.out.println("The value of the variable var3 after division is -"+divisionException);
		}
		
		}
		
	
	public static void main(String[] args) {
		
		Methodexample6 m5=new Methodexample6();
		System.out.println("******Division Method******");
		m5.division();
		
	}
}
