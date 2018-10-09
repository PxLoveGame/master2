public class A { 
	private String name;
	private String nickName;
	private int age;
	
	
	public A(String n, String nn, int a){
		this.name = n;
		this.nickName = nn;
		this.age = a;
	}
	
	public String toString(){
		return "Bonjour ! je m'appel "+ this.name + " Mais appelez moi "+ this.nickName + " ! \n J'ai " + this.age + "ans ! ;)";
	}
}
