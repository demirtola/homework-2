
public class Solider extends person {
	private int armour;

	public Solider(String name, int age, int health, int stamina, int armour) {
		super(name, age, health, stamina);
		this.armour = armour;
	}
	
	public void info() {
		System.out.print("name\t\t");
		System.out.println(this.name);
		System.out.print("age\t\t");
		System.out.println(this.age);
		System.out.print("health\t\t");
		System.out.println(this.health);
		System.out.print("stamina\t\t");
		System.out.println(this.stamina);
		System.out.print("armour\t\t");
		System.out.println(this.armour);
	}
	
	public void attack(person target) {
		target.setHealth(target.getHealth()-40);
	}
	
	public int getHealth() {
		return health + armour;
	}
}
