package test;

class Hero{
	public String name;
	public int ap;
	
	public Hero(String n, int p) {
		name = n;
		ap = p;
	}
	
//	public void attack() {
//		System.out.println("����");
//	}
//	
//	public void def() {
//		System.out.println("���");
//	}
	

}

class Genji extends Hero{
	public Genji() {
		super("genji", 20);
	}
}

public class test {
	


	public static void main(String[] args) {
		
		Hero hero = new Hero("����",10);
		Hero hero2 = new Hero("����",30);
		System.out.println(hero.ap);
		System.out.println(hero2.ap);
		
		hero.attack();
		hero.def();
		
	}
}
