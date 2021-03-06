/**
 * 
 * @author Louis Daviaud
 *
 */
public abstract class Main {
	/*
	 * Probleme : On a un enum (Animal) qui contient les differents types d'animaux mais
	 * les noms sont beaucoup trop generiques. Il faut les modifier pour les rendres plus realistes
	 *
	 * Sujet : Rename enum constants
	 */
	public static void main(String[] Args) {
		System.out.println("Different animals : ");

		System.out.println(Animal.CHIEN);

		System.out.println(Animal.CHAT);

		System.out.println(Animal.LION);
	}
}
