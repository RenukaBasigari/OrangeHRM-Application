package Arrays;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
    String array1[][]=new String[2][2];
    
    array1[0][0]="Manual Testing";
    array1[0][1]="Venkat Sir";
    array1[1][0]="Selenium";
    array1[1][1]="Srini Sir";
    
    /*System.out.println(array1[0][0]);
    System.out.println(array1[0][1]);
    System.out.println(array1[1][0]);
    System.out.println(array1[1][1]);*/
    
    for(int index=0;index<=1;index++)
    {
    	for(int indexi=0;indexi<=1;indexi++)
    	{
    		System.out.println(array1[index][indexi]);
    	}
    }
    
    
    
   
	}

}
