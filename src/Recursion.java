
public class Recursion {

	public static int outputNubers(int a, int b) {
		if (a == b) {
			System.out.println(a);
			return a;
		}
		System.out.println(a);
		return a < b ? outputNubers(a + 1, b) : outputNubers(a - 1, b);
	}
	
}
