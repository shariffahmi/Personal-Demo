package arraysconcept;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Nabiha");
		name.add("Nasiha");
		name.add("samina");
		name.add(3, "000000");

		System.out.println(name.size());
		System.out.println(name);
		for (String x : name) {

			System.out.print(x + " ");
		}
		System.out.println();
		name.remove(3);
		System.err.println(name);

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(5);
		number.add(10);
		number.add(15);
		number.add(20);
		System.out.println("ArrayList Size :" + number.size());
		for (int n : number) {
			System.out.print(n + " ");
		}
            System.out.println();
		Collections.sort(number);
		System.out.println(number);
		Collections.sort(number,Collections.reverseOrder());
		System.out.println(number);
	}
}
