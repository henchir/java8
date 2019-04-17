package Test;




public class Test6 {
	public interface Reproduction {

		public static void description() {
			System.out.println("M�thode statique dans une interface");
		}
		
	}
	
	
	public interface Mitose extends Reproduction {
		public static void description() {
			Reproduction.description();
			System.out.println("Red�finie dans Mitose.java");
		}
		
		default void reproduire() {
			System.out.println("Je me divise !");
		}
	}

	public interface Pondre extends Reproduction {

		public static void description() {
			Reproduction.description();
			System.out.println("Red�finie dans Pondre.java");
		}

		
		default void reproduire() {
			System.out.println("Je ponds des oeufs !");
		}
		
	}



	public class Alien implements Pondre, Mitose {

		public void reproduire() {
			
			System.out.println("Je suis un alien et :");
			Pondre.super.reproduire();
			Mitose.super.reproduire();

		}
	}
	
	public static void main(String[] args) {
		Reproduction.description();
		Pondre.description();
		Mitose.description();	
	}
}