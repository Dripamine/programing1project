package programing1project;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner kb = new Scanner(System.in);

        System.out.print("Joker: ");
        int joker = kb.nextInt();

        System.out.print("How many Numbers: ");
        int count = kb.nextInt();

        System.out.println("Enter numbers:");
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = kb.nextInt();
        }

        for (int i = 0; i < count; i++) {
            if (numbers[i] >= joker) {
                while (numbers[i] >= joker) {
                    numbers[i] -= joker;
                }
            }
        }

        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        kb.close();

	}

}
