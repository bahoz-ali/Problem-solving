package Patterns;

public class StrangePattern {

	public static void main(String[] args) {
		strangePattern(3);
	}

	public static void strangePattern(int n) {
		upperPart(n);
		lowerPart(n);
	}

	private static void upperPart(int n) {
		for (int i = 1; i <= n; i++) {
			upperLeft(n, i);
			upperRight(n, i);
			System.out.println();
		}
	}

	private static void lowerPart(int n) {
		for (int i = n - 1; i >= 1; i--) {
			upperLeft(n, i);
			upperRight(n, i);
			System.out.println();
		}
	}

	private static void upperRight(int n, int i) {
		int min;
		for (int j = n - 1; j >= 1; j--) {
			min = i < j ? i : j;
			System.out.print(n - min + 1 + " ");
		}
	}

	private static void upperLeft(int n, int i) {
		int min;
		for (int j = 1; j <= n; j++) {
			min = i < j ? i : j;
			System.out.print(n - min + 1 + " ");
		}
	}

}// class
