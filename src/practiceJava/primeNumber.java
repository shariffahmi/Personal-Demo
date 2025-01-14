package practiceJava;

public class primeNumber {

	public  primeNumber(int x) {
		System.out.println(x+"\nTHis is my first cons");
	}

	primeNumber(int x, int y) {
		System.out.println(x*y +" " +"\"THis is my second cons\"");
	}

	primeNumber(String x, String y) {
		System.out.println("THis is my 3rd cons");
	}

	public static void main(String[] args) {
		primeNumber obj=	new primeNumber(30);
	 	new primeNumber(3,6);
	 	new primeNumber("Sharif", "Fahmi");

	}

}
