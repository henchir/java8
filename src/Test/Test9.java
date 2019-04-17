package Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 6, 5, 4, 3, 2, 1 };

		List<Integer> list = IntStream.range(0, a.length).filter(i -> i % 2 != 0 && a[i] != 4).mapToObj(i -> a[i])
				.sorted().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("HENCHIRMOHAMED HENCHIRMOHAMED HENCHIRMOHAMED");
	}

}
