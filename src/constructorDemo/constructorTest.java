package constructorDemo;

public class constructorTest {
	String name, address;
	int phone;
//constructor
	constructorTest(String x, String y) {

		System.out.println(x + y);

	}
// Non-Static Mathod
	void dataInput(String x, String y) {
		System.out.println(x + y);

	}
	public static void dataInput1(int x, int y) {
		System.out.println(x * (y+ x)+y);
		
	}
//Parametirsed constructor
	constructorTest(String x, String y, int z) {
		String name;
		String address;
		int phone;

		System.out.println(x + " "+ y + "  "+ z);

	}
	// constructor
	constructorTest() {

		
		System.out.println("No Value");

	}
	
	void display() {
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone);
		
	}
	

	public static void main(String[] args) {
// now need create object for constructor
		
		constructorTest obj= new constructorTest("Sharif", "Fahmi", 012455);
		 
		 new constructorTest();
		obj.display();
		 /*constructorTest obj = new constructorTest();
		 obj.dataInput("Quayum", "Amin");
		new constructorTest("Sharif", "Fahmi",1254);
		new constructorTest();
		constructorTest.dataInput1(2, 2);*/
	
	}

	

}
