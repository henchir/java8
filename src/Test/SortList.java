package Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String args[]) {

		SortList classInst = new SortList();
		List<String> names1 = new ArrayList<String>();
		List<String> names2 = new ArrayList<String>();

		names1.add("C");
		names1.add("D");
		names1.add("B");
		names1.add("A");

		names2.add("F");
		names2.add("E");
		names2.add("H");
		names2.add("G");

//		System.out.println("JAVA 7");
//		System.out.println(names1);
//		tester.sort7(names1);
//		System.out.println(names1);
//		System.out.println("JAVA 8");
//		System.out.println(names2);
//		tester.sort8(names2);
//		System.out.println(names2);

		System.out.println(names1);
		System.out.println("sort list");
		classInst.sort(names1);
		System.out.println(names1);

	}


	// sort using java 8

	private void sort8(List<String> list) {
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
	}

	private void sort(List<String> list) {
		Collections.sort(list, (ch1, ch2) -> ch2.compareTo(ch1));
	}

}
