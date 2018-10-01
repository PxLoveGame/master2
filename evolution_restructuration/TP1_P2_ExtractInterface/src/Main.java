/**
 * 
 * @author anthony chaillot
 *
 */

public class Main {

	public static void main(String[] args){
		
		Animal animal = new Animal("Toto", "Chien", 12);
		
		System.out.println(animal.getName());
		System.out.println(animal.getBreed());
		System.out.println(animal.getAge());
		
		System.out.println("~~~~~~~~");
		
		animal.printInfo();
	}
}
