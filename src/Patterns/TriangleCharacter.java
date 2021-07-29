package Patterns;

public class TriangleCharacter {

	public static void main(String[] args) {

		char chars[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
		triangleCharacter(chars);

	}

	public static void triangleCharacter(char[] chars) {
		int length = chars.length;

		for (int i = 0; i < length; i++) {
			printSpaces(length, i);
			printChars(chars, i);
			System.out.println("");
		}

	}

	private static void printChars(char[] chars, int i) {
		for (int j = 0; j < i + 1; j++) {
			System.out.print(chars[j] + " ");
		}
	}

	private static void printSpaces(int length, int i) {
		for (int j = 0; j < length - i; j++) {
			System.out.print(" ");
		}
	}
}
