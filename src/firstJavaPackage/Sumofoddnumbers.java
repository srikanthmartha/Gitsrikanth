package firstJavaPackage;
import java.util.ArrayList;

public class Sumofoddnumbers {

            public static void main (String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(4);
    		list.add(6);
    		list.add(9);
    		list.add(11);
			
			int res = 0;
			for(int i: list){
			   if(i%2!=0){
			       res=res + i;
			   } 
			}
			System.out.println(res);
			System.out.println("hello");
			System.out.println("hi");
			
		}
	}


