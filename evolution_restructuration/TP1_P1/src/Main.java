

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author anthony chaillot
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		List<Integer> marks = new ArrayList<>();
		marks.add(18);
		marks.add(14);
		marks.add(12);
		marks.add(8);
		marks.add(6);
		Student student = new Student(22,"Paul","C124548","Master AIGLE", marks);
		
		
		student.printInfo();

	}

}
