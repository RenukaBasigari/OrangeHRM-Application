package Arrays;

import java.lang.reflect.Array;

public class ObjectArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax=Object array Name[]=new Object[size]
		//Syntax=Object array Name[][]=new Object [size][size]
		
		Object array1[]=new Object[4];
		array1[0]=20;
		array1[1]="webDriver";
		array1[2]='A';
		array1[3]=10.12345;
		
		//System.out.println(array1[0]);
		//System.out.println(array1[1]);
		//System.out.println(array1[2]);
		//System.out.println(array1[3]);
		
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		
		}
    System.out.println("######### For Each Loop ######");
    
    //Syntax of "For Each Loop"
    
    //for(dataType arrayIndex:arrayName)
    {
    	for(Object arrayIndex:array1)
    	{
    		System.out.println(arrayIndex);//
    		
    		
    
    	}
    }

	}

}
