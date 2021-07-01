package firstJavaPackage;

public class MeathodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean isprime = true;
		if(prime(8.2d)) {
			System.out.println("prime number");
		}
		else {
			System.out.println("notprime");
		}
		
		

	}
	
	public static boolean prime(int a) {
		int temp;
		boolean isprime = true;
		for(int i=2;i<a;i++)
		{
			temp= a%i;
			if(temp==0)
			{
				isprime = false; 
				break;
			}
		}
		return isprime;
	}

	public static boolean prime(double d) {
		int a = (int) d;
		float temp;
		boolean isprime = true;
		for(int i=2;i<a;i++)
		{
			temp= a%i;
			if(temp==0)
			{
				isprime = false;
				break;
			}
		}
		return isprime;
	}
}
