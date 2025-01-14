package arraysconcept;

import java.util.ArrayList;

public class ArrayList_Demo1 {

	
	
	public static void main(String[] args) {
		 ArrayList<Integer> number= new ArrayList<Integer>();
		 System.out.println(number.size());
		 System.out.println(number);
		 
		 number.add(25);
		 number.add(30);
		 number.add(-3);
		 number.add(40);
		 number.add(2);
		 System.out.println(number.size());
		 System.out.println(number);
		 number.add(5, 100);
		 System.out.println(number);
		 number.remove(5);
		 System.out.println(number);
		 
		 int sum=0;
		 for(int x:number) {
			 System.out.print(" "+ sum);
			 sum = sum+x;
			  
		 }
		  
			
			
		 
	}

}
