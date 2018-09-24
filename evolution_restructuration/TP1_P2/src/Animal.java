/**
 * 
 * @author anthony chaillot
 *
 */

// code a refactor 
// type de refactor : extract Interface
// On voudrait extraire les méthodes public dans une interface. 

public class Animal {
	
	private String name;
	private String breed;
	private int age;
	
	public Animal(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getBreed(){
		return this.breed;
	}
	
	public void printInfo(){
		System.out.println(this.breed + " s'appelant " + this.name + " agé de  " + this.age + "ans !");
	}
	

	private void setBreed(String breed){
		this.breed = breed;
	}
	
	
	
}