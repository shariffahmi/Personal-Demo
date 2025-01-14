package constructorDemo;

public class Teacher {

	String name, gender;
	int phone;
    String address;
    int age;
	public void setInformation(String x, String y, int ph) {

		name = x;
		gender = y;
		phone = ph;
		System.out.println(x);

	}
	
	Teacher(String n, int age1){
		
		  name=n;
		  gender=n;
		  age=age1;
		  System.out.println(n+" "+age1);
	}
	
	void displayedInformation () {
		
		System.out.println("\"Name\" :"+ name +"");
		System.out.println("gender :"+ gender);
		System.out.println("phone :"+phone);
		System.out.println( age);
		
	}
	//Constructor
	

}
