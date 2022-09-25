
public class Main {

	public static void main(String[] args) {
		System.out.println(power(5,3));
	}
	
	public static int power(int base, int power) {
		int number = 1;
		for(int i = 0; i < power; i++) {
			number *= base;
		}
		return number;
	}

}
