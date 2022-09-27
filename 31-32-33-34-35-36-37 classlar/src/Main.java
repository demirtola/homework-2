
public class Main {

	public static void main(String[] args) {
		
		person random_guy = new person("mete", 21, 100, 100);
		System.out.println("random_guy's info:");
		random_guy.info();
		random_guy.walk(5);
		System.out.println("\nrandom guy's stamina after walking = " + random_guy.getStamina());

		Solider er = new Solider("mehmet", 35, 100, 100, 35);
		Solider terrorist = new Solider("eray", 35, 100, 100, 35);

		terrorist.attack(random_guy);
		System.out.println("random guy's health after terrorist attack = " + random_guy.getHealth());
		
		random_guy.run(40);
		System.out.println("random guy's stamina after running away from terrorist = " + random_guy.getStamina());
		
		for(int i = 0; i < 10; i++) {
			er.attack(terrorist);
			System.out.println("terrorist's health after er's attack = " + terrorist.getHealth());
		}
	}

}
