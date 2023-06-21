package programing1project;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the array: ");
        String input = kb.nextLine();

        // Split the input string into individual numbers
        String[] numbers = input.split(" ");

        // Convert the numbers to integers and create the array
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        int missingNumber = findMissingNumber(nums);

        System.out.println("The missing number is: " + missingNumber);

        kb.close();
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        // Calculate the sum of all numbers in the array
        for (int num : nums) {
            actualSum += num;
        }

        // Calculate the missing number
        return expectedSum - actualSum;

	}

}
