package programing1project;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		System.out.println("Enter 3 2-digit numbers:");
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();

		int sum = n1 + n2 + n3;
		String magicNumber;

		if (sum % 3 == 0 && sum % 5 != 0) {
			int firstDigit = n2 / 10;
			magicNumber = firstDigit + "" + (n1 + n3);
		} else if (sum % 3 != 0 && sum % 5 == 0) {
			int lastDigit = n2 % 10;
			magicNumber = (n1 + n3) + "" + lastDigit;
		} else if (sum % 3 == 0 && sum % 5 == 0) {
			magicNumber = n2 + "" + n1 + "1";
		} else {
			magicNumber = n1 + "" + n2 + "" + n3;
		}

		System.out.println("Your magic number is " + magicNumber);

		kb.close();

	}

}
