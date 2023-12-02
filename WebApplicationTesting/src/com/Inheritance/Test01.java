package com.Inheritance;

public class Test01  extends Test02{
	
	public void addition ()
	{
		//Local Variables 
		int var1=30;
		int var2=50;
		int var3;
		var3=var1+var2;
		System.out.println("The Value of the variable var3 after Addition is"+var3);
	
	}
	public static void main(String[] args) {
		 Test01 t1=new Test01();
		 t1.addition();
	}

}
