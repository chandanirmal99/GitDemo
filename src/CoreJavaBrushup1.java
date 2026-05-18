
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// {Section 3 - Chapter 20}\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		int myNum = 5 ;
		String website = "Rahul shetty Academy";
		char letter = 'r';
	  double dec = 5.99;
	  float dec1 = 5.89f;
	    boolean mycard = true;
	   
	   
	   
		
// System.out.println(myNum + " is the value stored in the myNum varibale");
// System.out.println(website);
// System.out.println(letter);
// System.out.println(dec);
// System.out.println(dec1);
// System.out.println(mycard);
// 
 
 
  // {Section 3 - Chapter 21}\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 
 // Arrays - 
 
 
// int[] arr = new int[5];
// 
// arr[0]=1;
// arr[1]=2;
// arr[2]=3;
// arr[3]=4;
// arr[4]=5;
// 
// System.out.println(arr[0]);
 
// int[] arr2 = {1,2,3,4,5};
// 
// System.out.println(arr2[3]);
 
 
 //{Section 2 - Chapter 22}\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 
 // for loop -
 
//int[] arr = new int[5];
// 
// arr[0]=1;
// arr[1]=2;
// arr[2]=3;
// arr[3]=4;
// arr[4]=5;
// 
// for (int i = 0; i<arr.length; i++ )
// 
// {
//	 System.out.println(arr[i]);
// 
// }
// 
// int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
// 
// for (int g = 0; g<arr2.length; g++)
//	 
// { System.out.println(arr2[g]);
// 
// }
//
// String[] name = {"Rahul", "shettY", "Selenium"};
// 
// for (int g = 0; g<name.length; g++)
//	 
// {
//	 System.out.println(name[g]);
// }
 
 // [Section 3 - Chapter 23} \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 
 int[] arr = new int[5];
 
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;

for (int i:arr)
 
{
	System.out.println(i);
}
int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};

for (int g: arr2)
	
{
System.out.println(g);	
}

String[] name = {"Rahul", "Shetty", "Academy"};

for (String h:name)
	if (h == "Academy")
{System.out.println(h);


	
}
	}

}
