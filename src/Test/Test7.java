package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test7 {
	public static void main(String[] args) {
		List<Personne> listP = Arrays.asList(new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
				new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON));

//		Stream<Integer> stream = Stream.of(4,3,14,15,18,39,56,89,101,150,165,187);
//	    List<Integer> even = stream.filter(i -> (i % 2  != 0) && i!=9 && i!=3)
//	                                .collect(Collectors.toList());
		Integer[] names = { 5,6,8,9,11,14,16,18,20,25 };
		List<Integer> even = IntStream.range(0, names.length).filter(i -> i % 2 != 0 && names[i] >= 2)
				.mapToObj(i -> names[i]).sorted().collect(Collectors.toList());

		System.out.println("processed list, only even numbers: " + even);

		boolean emty = true;
		for (int j = 0; j < even.size(); j++) {
			if (isPremierr(even.get(j))) {
				System.out.println("isPremier : " + even.get(j));
				 emty = false;
				break;
			}
		}
		System.out.println("processed list, only even numbers: " + even);

//		Stream<Personne> sp = listP.stream();
//		sp.forEach(System.out::println);

//		System.out.println("\nAprès le filtre");
//		sp = listP.stream();
//		sp.filter(x -> x.getPoids() > 50).forEach(System.out::println);

//		Stream.iterate(1, (x) -> x + 1).limit(100).forEach(System.out::println);	

//		Stream<Personne> sp = listP.stream();
//		sp.forEach(System.out::println);
//
//		System.out.println("\nAprès le filtre et le map");
//		sp = listP.stream();
//		sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).forEach(System.out::println);

//		Stream<Personne> sp = listP.stream();
//		sp.forEach(System.out::println);

//		System.out.println("\nAprès le filtre et le map et reduce");
//		sp = listP.stream();
//
//		Double sum = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).reduce(0.0d, (x, y) -> x + y);
//		System.out.println(sum);

//		System.out.println("\nAprès le filtre et le map et reduce");
//		sp = listP.stream();
//
//		Optional<Double> sum = sp.filter(x -> x.getPoids() > 250).map(x -> x.getPoids()).reduce((x, y) -> x + y);
//		if (sum.isPresent())
//			System.out.println(sum.get());
//		else
//			System.out.println("Aucun aggrégat de poids...");

//		sp = listP.stream();
//
//		Optional<Double> sum = sp	.filter(x -> x.getPoids() > 250)
//									.map(x -> x.getPoids())
//									.reduce((x,y) -> x+y);
//		//Permet de gérer le cas d'erreur en renvoyant 0.0 si isPresent() == false
//		System.out.println(sum.orElse(0.0));

//		sp = listP.stream();
//
//		long count = sp	.filter(x -> x.getPoids() > 50)
//						.map(x -> x.getPoids())
//						.count();
//
//		System.out.println("Nombre d'éléments : " + count);

//		sp = listP.stream();
//
//		List<Double> ld = sp.filter(x -> x.getPoids() > 50)
//							.map(x -> x.getPoids())
//							.collect(Collectors.toList());
//		System.out.println(ld);

//		String fileName = "D://note.txt";
//		try(Stream<String> sf = Files.lines(Paths.get(fileName))){
//			sf.forEach(System.out::println);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}

	public static boolean isPremier(int n) {
		boolean isPremier = true;
		if (n < 0) {
			isPremier = false;
		} else if (n != 0 && n != 1) {
			for (int i = 2; i <= n / 2; i++) {
				if (n != i && n % i == 0) {
					isPremier = false;
					break;
				}
			}
		}
		return isPremier;
	}

	public static boolean isPremierr(int n) {
		boolean isPremier = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n != i && n % i == 0) {
				isPremier = false;
				break;
			}
		}
		return isPremier;
	}
}
