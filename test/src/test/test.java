package test;

class Hero{
	public String name;
	public int ap;
	
	public Hero(String n, int p) {
		name = n;
		ap = p;
	}
	
//	public void attack() {
//		System.out.println("공격");
//	}
//	
//	public void def() {
//		System.out.println("방어");
//	}
	

}

class Genji extends Hero{
	public Genji() {
		super("genji", 20);
	}
}

public class test {
	


	public static void main(String[] args) {
		
		Hero hero = new Hero("겐지",10);
		Hero hero2 = new Hero("라인",30);
		System.out.println(hero.ap);
		System.out.println(hero2.ap);
		
		hero.attack();
		hero.def();
		
	}
}
