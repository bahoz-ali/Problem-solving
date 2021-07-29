package Patterns;

public class Kshape {

	public static void main(String[] args) {
		char chars[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
		kShape(chars);

	}

	public static void kShape(char chars[]) {
		int length = chars.length;

		for (int i = 0; i < length; i++) {

			for (int j = 0; j < length - i; j++) {
				System.out.print(chars[j] + " ");
			}
			if (i != length - 1)
				System.out.println("");
		}
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(chars[j] + " ");
			}
			System.out.println("");
		}
	}

}
