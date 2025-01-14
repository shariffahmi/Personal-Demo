package oppsConcept;

public class Teacher {

	int age;
	String subject;
	String name;
	String address;
	int phone;
	String Hire_Date;

	void displayInformation() {

		System.out.println(name + ": " + "THis is name");
		System.out.println(age + "THis is age");
		System.out.println(subject + "THis is subject");

	}

	void verification() {
		System.out.println(address + ": " + " " + "Person's add");
		System.out.println(phone + " " + "Person's phone");
		System.out.println(Hire_Date + " " + "Person's Hire_date");

	}

}
