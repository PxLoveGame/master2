import java.util.List;
/**
 * 
 * @author anthony chaillot
 *
 */


// Code a refactor
// type de refactor : Extract Method 
// On voudrait extraire certaines parties de la méthode printInfo, de façon à avoir des sous méthodes (nottament pour les notes..)


public class Student {
	
	private int age;
	
	private List<Integer> marks; 
	
	private String name;
	private String codeINE;
	private String formation;
	
	public Student (int age, String name, String codeINE, String formation, List<Integer> marks){
		this.age = age;
		this.name = name;
		this.codeINE = codeINE;
		this.formation = formation;
		
		this.marks = marks;
	}
	
	
	public void printInfo(){
		System.out.println("L'étudiant " + this.name + " agé de : " + this.age + " ans");
		System.out.println("CodeINE : " + this.codeINE);
		System.out.println("Suis la formation : "+ this.formation);
		
		System.out.println("Il a obtenue les notes suivantes : ");
		for(Integer mark : marks){
			System.out.println(mark);
		}
	}
	
}
