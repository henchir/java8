package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static boolean isPremier(int n) {
		boolean isPremier = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n != i && n % i == 0) {
				isPremier = false;
				break;
			}
		}
		return isPremier;
	}

	public static void main(String[] args) {
		int[] vector = null;
		Integer result = null;
		try (Scanner scanner = new Scanner(new File(args[0]))) {
			String[] numberTokens = scanner.nextLine().split(",");
			vector = new int[numberTokens.length];
			for (int i = 0; i < numberTokens.length; i++) {
				vector[i] = Integer.parseInt(numberTokens[i]);
			}
		} catch (FileNotFoundException ex) {
			throw new RuntimeException(ex);
		}
		/* YOUR CODE HERE */
		Integer[] Vector = Arrays.stream(vector).boxed().toArray(Integer[]::new);
		List<Integer> even = IntStream.range(0, Vector.length).filter(i -> i % 2 != 0 && Vector[i] >= 2)
				.mapToObj(i -> Vector[i]).sorted().collect(Collectors.toList());

		for (int j = 0; j < even.size(); j++) {
			if (isPremier(even.get(j))) {
				result = even.get(j);
				break;
			}
		}

		if (result != null) {
			System.out.println(result > 0 ? result : "NULL");
		} else {
			System.out.println("NULL");
		}
	}
	
	
//	result = list.stream().mapToInt(i->i).toArray();
}
