package oppsConcept;

public class Student extends Teacher {
	/*
	 * int age; String subject; String name; String address; int phone; String
	 * Hire_Date; displayInformation() void verification()
	 */
String country;
	public void displayInformation1() {
		System.out.println(country);
		displayInformation();

	}

	void displayInformation2() {
		verification();

	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.country= "Bangladesh";
		obj.name = "Quayum";
		obj.age = 23;
		obj.subject= "Physics";
		obj.displayInformation1();
		obj.address= "SHerman Way";
		obj.Hire_Date = "12/12/2024";
		obj.phone = 1718663;
		obj.displayInformation2();
		
	}

}
