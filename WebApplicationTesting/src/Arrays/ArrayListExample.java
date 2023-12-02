package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//syntax
		//List<dataType>arrayListName=new ArrayList<>();
		
		List<Object>arrayList1=new ArrayList<>();
		
		//arrayList1[0]=10;
		arrayList1.add("Laddu");
		arrayList1.add("10");
		arrayList1.add("Selenium");
		arrayList1.add('A');
		arrayList1.add(10.1234);
		
		//System.out.println(arrayList1);
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.get(3));//
		
		for(Object arrayIndex:arrayList1)
		{
			System.out.println(arrayIndex);
		}
		
		

	}

}
