
public class Line extends Figure{

private Point p1, p2;
	
	public Point getP1(){
		return this.p1;
	}
	
	public Point getP2(){
		return this.p2;
	}
	
	public void setP1(Point p){
		this.p1 = p;
	}
	
	public void setP2(Point p){
		this.p2 = p;
	}
	
	public String toString(){
		return "La ligne comporte les points : \n" + this.p1 + "de coordonnée - x : " + this.p1.getX() + " - y : " + this.p1.getY() + "\n"
				+ this.p2 + "de coordonnée - x : "  + this.p2.getX() + " - y : " + this.p2.getY() + "\n";
	}
}
