package firstJavaPackage;

import java.util.Scanner;

public class assignment {
	 public static void main(String[] args) {
	        
	        int a, b, sum, sub, mul, div;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter First Number: ");
	        a = sc.nextInt();
	        
	        System.out.println("Enter Second Number: ");
	        b = sc.nextInt();
	        
	        sc.close();
	        sum = a + b;
	        sub= a - b;
	        mul =a * b;
	        div = a / b;
	        System.out.println("Sum of two numbers: "+sum);
	        System.out.println("subtraction of two numbers: "+sub);
	        System.out.println("mul of two numbers: "+mul);
	        System.out.println("div of three numbers: "+div);

}
}
