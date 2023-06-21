package programing1project;

import java.util.Scanner;

public class Question5 {

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

        int majorityElement = findMajorityElement(nums);

        System.out.println("The majority element is: " + majorityElement);

        kb.close();
    }

    public static int findMajorityElement(int[] nums) {
        int majorityElement = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count++;
            } else if (majorityElement == num) {
                count++;
            } else {
                count--;
            }
        }

        return majorityElement;

	}

}
