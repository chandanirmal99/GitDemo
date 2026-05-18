import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 // Section 3 = Chapter 23 ////////////////////////////////////////////////
		
//		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
//		
//		for (int i = 0; i<arr2.length; i++ )
//			
//			if (arr2[i] % 2 ==0)
//		
//		
//		{
//			System.out.println(arr2[i]);
//			break;
//			
//			}
//			else
//				
//			{
//				System.out.println(arr2[i]+ " is not multiple of 2");
//				
//			}
		
// Section 3 = Chapter 25 ////////////////////////////////////////////////
		
		
//		ArrayList <String> a = new ArrayList <String>();
//		
//		a.add("rahul");
//		a.add("shetty");
//		a.add("academy");
//		a.add("selemium");
//		a.remove(1);
//		
//		System.out.println(a.get(1));
		
		//create object of the class - object.method
		
		
// Section 3 = Chapter 26 //////////////////////////////////////////////////////
		
		
		ArrayList <String> a = new ArrayList <String>();
	
	  a.add("rahul");                  
	  a.add("shetty");
	  a.add("academy");
	  a.add("selenium");
	  
	  for (int i =0; i<a.size(); i++ )
	  
	  System.out.println(a.get(i));
	  
	  System.out.println("****************");
	  
	  for (String g:a)
	  
	  System.out.println(g);
	  
	  System.out.println(a.contains("selenium"));
	  
	  // To covert array into Arraylist
	  
	  String[] name = {"Rahul","Shetty", "Academy"};
	 
	List <String>  Jay = Arrays.asList(name);
	  System.out.println(Jay);
	  System.out.println(Jay.contains("Shetty"));
	  

	

	}

}
