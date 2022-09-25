
public class Main {

	public static void main(String[] args) {

		int[] sayi1 = new int[] {1};
		int[] sayi2 = new int[] {2};
		sayi2 = sayi1;
		sayi2[0] = 3;
		
		System.out.println(sayi1[0]);
	}

}
