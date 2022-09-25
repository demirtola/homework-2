
public class Main {

	public static void yazdir(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.print(message);
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		String metin = "*";
		int basamak = 20;
		for(int i = 1; i < basamak+1; i++) {
			yazdir(metin, i);
		}

	}

}
