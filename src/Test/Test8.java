package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test8 {

	public static void main(String[] args) {
//		Integer[] names = { 2, 4, 3, 5, 6, 1 };
//		System.out.println("List : " + names);
//		List<Integer> filtred = Stream.of(names).filter(i -> i > 3).collect(Collectors.toList());
//		System.out.println("filtredList : " + filtred);
//		List<Integer> sorted = Stream.of(names).sorted().collect(Collectors.toList());
//		System.out.println("sortedList" + sorted);
//
//		List<Integer> list1 = IntStream.range(0, names.length).filter(i -> i % 2 != 0).mapToObj(i -> names[i])
//				.collect(Collectors.toList());
//		System.out.println(list1);

		String A[] = { "9:10", "12:00", "11:20", "11:30", "19:00", "20:00" };
		String D[] = { "9:10", "12:00", "11:20", "11:30", "19:00", "20:00" };
		int gates = 0;
//		IntStream differences = 
//			    IntStream.range(0, A.length - 1)
//			        .map(i -> A[i + 1] - A[i]);
//		List<Integer> list1 = IntStream.range(0, A.length)
//				.mapToObj(i -> Integer.parseInt(A[i].split("\\:")[0]) * 60 + Integer.parseInt(A[i].split("\\:")[1])).sorted()
//				.collect(Collectors.toList());
//		Integer [] a = list1.stream().toArray(Integer[]::new);
//		long result = IntStream.range(0, a.length - 1)
//				.mapToObj(i -> a[i + 1] - a[i]).sorted().filter(i -> i < 60)
//				.count() + 1;
//		System.out.println(list1);
//		System.out.println(result);
		String ch = "1213";
		ch.length();
		System.out.println(ch.charAt(ch.length() - 2) +""+ ch.charAt(ch.length() - 1));
//		System.out.println(part.);
//		List<String> list = Stream.of(A).
//		long arr = Stream.of(A)
//			     .collect(Collectors.groupingBy(p -> p.split("\\:")[0], 
//			         Collectors.counting())).entrySet().stream().mapToLong(v -> v.getValue()).max().getAsLong();
//		long dep = Stream.of(D)
//			     .collect(Collectors.groupingBy(p -> p.split("\\:")[0], 
//			         Collectors.counting())).entrySet().stream().mapToLong(v -> v.getValue()).max().getAsLong();
//		System.out.println(arr + "  " + dep);

	}

}
