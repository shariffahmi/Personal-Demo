package arraysconcept;

public class arrayDemo {

	// Array - contains multiple variable is one datatype.

	public static void main(String[] args) {

		//double[] number = new double[5];
		/*number[0]=2;
		number[1]=3;
		number[2]=4;
		number[3]=5;
		number[4]=6;*/
		
		int[] number = {2,3,4,5,6};
		System.out.println("Length of Array :"+number.length);
		

		for(int i=0; i<5;i++) {
			System.out.print(number[i]);
			
		}

		

	}
}
