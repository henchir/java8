package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main1 {
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
		int N;
		int[] result = null;

		try (Scanner scanner = new Scanner(new File(args[0]))) {
			N = Integer.parseInt(scanner.nextLine());
			/* YOUR CODE HERE */
			List<Integer> list = Stream.iterate(2, (x) -> x + 1).limit(N - 2).collect(Collectors.toList());
			List<Integer> resultList = new ArrayList<>();
			for (int j = 0; j < list.size(); j++) {
				if (isPremier(list.get(j))) {
					resultList.add(list.get(j));
				}
			}
			result = resultList.stream().mapToInt(i -> i).toArray();
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[j]);
				if (j < result.length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		} catch (FileNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}
}