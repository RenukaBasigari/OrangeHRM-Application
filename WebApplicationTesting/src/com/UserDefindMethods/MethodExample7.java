package com.UserDefindMethods;

import org.apache.poi.hpbf.model.MainContents;

public class MethodExample7 {
	
	
	public void addition()
	{
		//Local Variables
		int var1=30;
		int var2=50;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the variable var3 after addition is-"+var3);
		}
	
	public void addition(int var1,int var2)
	{
	//Local Variables
		//int var1=30;
		//int var2=50;
		
		//int var1;
		//int var2;
		int var3;
		var3=var1+var2;
	}
	public void addition(int var1,int var2,int var3)
	{
		//int var1=30;
				//int var2=50;	
		//int var1
		//int var2
		//int var3
		var3=var1+var2+var3;
		System.out.println("The value of the variable var3 is-"+var3);
		
		
	}
	
	public void addition(int var1,int var2,int var3,double var4)
	{
	var4=var1+var2+var3+var4;
	System.out.println("The value of the variable var4 after addition is-"+var4);
	}
	
	
	
	public static void main(String[] args) {
		MethodExample7 m7=new MethodExample7();
		System.out.println("Calling the addition Method without parameters");
		m7.addition();
		
		System.out.println("Calling the Addition with 3 parameters");
		m7.addition(100, 100,100);;
		System.out.println();
		m7.addition(100,500,700);
		System.out.println();
		
		System.out.println("Calling the Addition with 4 parameters ");
		m7.addition(200, 400, 500, 80.78);
		System.out.println();
		m7.addition(20, 30, 20, 20);
		System.out.println();
		
		
		
	}
	}

