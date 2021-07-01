package firstJavaPackage;

public class reverse {
	 public static void main(String[] args) {
		 int n=12345;
		 int k=0;
		 int res=0;
		 while(n!=0)
		 {
			 k=n%10;
			 res= (res*10) + k;
			
			 n=n/10;
		 }
		 System.out.println(res);
		 
		 
		 String str = "geeksforgeeks";
		 StringBuilder bild = new StringBuilder();
		 bild.append(str);
		 bild.reverse();
		 System.out.println(bild);
		 
		 
		 
//		 int x=5; 
//			int y =5;
//			int r=5;
//			//outer loop for rows 
//			for(x=r; x>=0; x--) 
//			{ 
//			//inner loop for columns 
//			for(y=0; y<=x; y++) 
//			{ 
//			//To prints stars 
//			System.out.print("* "); 
//			} 
//			//Cursor goes to the new line after printing each line. 
//			System.out.println(); 
//			} 
//		 
			int i, j, row = 5;       
			//Outer loop work for rows  
			for (i=0; i<row; i++)   
			{  
			//inner loop work for space      
			for (j=2*(row-i); j>=0; j--)         
			{  
			//prints space between two stars      
			System.out.print(" ");   
			}   
			//inner loop for columns  
			for (j=0; j<=i; j++ )   
			{   
			//prints star      
			System.out.print("* ");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
			}   
	 }


}
