package arraysconcept;
//Check github
public class ArrayDemo1 {

	 
	
	public static void main(String[] args) {
		 
		int [] number = new int[4];
		System.out.println("Length of Array :"+ number.length);
		
		number[0]=5;
		number[1]=10;
		number[2]=15;
		number[3]=20;
	System.out.println("Value of 0 index:" + number[0]);
	System.out.println("Value of 1 index:" + number[1]);
	System.out.println("Value of 2 index:" + number[2]);
	System.out.println("Value of 3 index:" + number[3]);
	
	//System.out.println(   number[0]+number[1]+number[2]+number[3] + ": Sum");	

	
	int [] number1= {25,30,45,50,60};
	int sum=0;
	System.out.println("Length of number1 :"+number1.length);
	
	for(int x:number1) {
		
		System.out.print(" "+x);
		sum = sum+x;  
		
	}
	System.out.println();

	System.out.println(" Sum of number1:"+ sum);
	System.out.println(" AVG of number1:"+ sum/5);
	
	
	
	
	}

}
