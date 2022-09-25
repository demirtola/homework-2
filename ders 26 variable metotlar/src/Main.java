
public class Main {

	public static void main(String[] args) {
		System.out.println(maximum(3,4,5,6,7,8,2,5,1,9));

	}
	
	public static int maximum(int... sayilar) {
		int max = sayilar[0];
		for(int i:sayilar) {
			if(i > max)	max = i;
		}
		return max;
	}
}
