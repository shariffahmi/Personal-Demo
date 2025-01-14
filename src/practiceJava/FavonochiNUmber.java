package practiceJava;

import java.util.Scanner;

public class FavonochiNUmber {
	

	public static void main(String[] args) {

		// 011235

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number1 = input.nextInt();
		int firstNumber = 0;
		int secondNumber = 1;
		int sum ;

		for (int i = 1; i <= number1; i++) {

			System.out.print(firstNumber + ", "); // 0
			sum = firstNumber + secondNumber;// sum= 0+1=1 0 1 1 2 3
			firstNumber = secondNumber; //
			secondNumber = sum;
		}
	}
}
