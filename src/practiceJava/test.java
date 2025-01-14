package practiceJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int SUM;
		int n = 10;
		
			for(int i =0; i<n;i++)	{                           //  0 1 1 2 NUM1 = 2  NUM 2 = 1  SUM =NUM 2+NUM1
				                                               //0  1 1  2
				System.out.println(num1 + ",");
				SUM =num2+num1;
				 num1=num2;
				 num2=SUM;
			}
			
			String Name  = "Sharif";
			String Name1 = "Al AMin";	
			String Name3 =  Name  + " "+	Name1;
			System.out.println(Name3  );

	}

}
