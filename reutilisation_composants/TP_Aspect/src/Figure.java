
public class Figure {

	
	public static void main(String[] args){
	
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(8);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(21);
		
		Line line = new Line();
		
		System.out.println("~~~~~~~");
		System.out.println("La ligne n'a pas encore de point.");
		
		line.setP1(p1);
		line.setP2(p2);
		
		System.out.println("~~~~~~~");
		System.out.println(line.toString());
		
		line.setP1(p2);
		
		System.out.println("~~~~~~~");
		System.out.println(line.toString());

	}
}
