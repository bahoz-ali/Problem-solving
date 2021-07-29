package Patterns;

public class DiamondCharacter {

	public static void main(String[] args) {
		char chars[] = new char[11];

		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'c';
		chars[3] = 'd';
		chars[4] = 'e';
		chars[5] = 'f';
		chars[6] = 'g';
		chars[7] = 'h';
		chars[8] = 'i';
		chars[9] = 'j';
		chars[10] = 'k';

		diamondCharacter(chars);
	}

	public static void diamondCharacter(char chars[]) {

		// first part
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length - i; j++) {
				System.out.print(" ");
			}

			if (chars[i] == 'a')
				System.out.print("a");
			else {
				System.out.print(chars[i]);
				for (int j = 0; j <= (i - 1) * 2; j++) {
					System.out.print(" ");
				}
				System.out.print(chars[i]);
			}
			System.out.println("");

		}

		// second part
		for (int i = chars.length - 2; i >= 0; i--) {
			for (int j = 0; j < chars.length - i; j++) {
				System.out.print(" ");
			}

			if (chars[i] == 'a')
				System.out.print("a");
			else {
				System.out.print(chars[i]);
				for (int j = 0; j <= (i - 1) * 2; j++) {
					System.out.print(" ");
				}
				System.out.print(chars[i]);
			}
			System.out.println("");

		}

	}// method

}
