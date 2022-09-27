
public class person {

	protected String name;
	protected int age;
	protected int health;
	protected int stamina;

	public person(String name, int age, int health, int stamina) {
		super();
		this.name = name;
		this.age = age;
		this.health = health;
		this.stamina = stamina;
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
	}

	public void walk(int meters) {
		if (this.stamina > 0 + meters) {
			this.stamina -= meters;
		}
	}

	public void run(int meters) {
		this.walk(meters * 2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
}
