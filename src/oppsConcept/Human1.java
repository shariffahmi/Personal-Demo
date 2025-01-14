package oppsConcept;

public class Human1 extends Human {
	String hire;
	String color;

	public void man() {
		System.out.println("Man's Hire is:"+ hire);
		humanClassified1();
	}

	public void woman() {
		System.out.println("Woman's Hire is:"+color);
		humanClassified2();
	}

	public static void main(String[] args) {
		Human1 obj = new Human1();
		//obj.hire="SHort";
		obj.name = "Quayum";
		obj.age = 43;
		obj.meritalstatus = "MARIED";
		obj.man();
		obj.color= "Black";
		obj.name = "Samina";
		obj.age = 49;
		obj.meritalstatus = "UnMARIED";
		obj.woman();
		
		

	}

}
