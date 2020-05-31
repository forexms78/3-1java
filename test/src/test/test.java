package test;

class Hero{
	public String name;


}

class Genji extends Hero{
	public Genji() {
		super("genji", 20);
	}
}

public class test {
	


	public static void main(String[] args) {
		
		Hero hero = new Hero("°ÕÁö",10);
		Hero hero2 = new Hero("¶óÀÎ",30);
		System.out.println(hero.ap);
		System.out.println(hero2.ap);
		
		hero.attack();
		hero.def();
		
	}
}
