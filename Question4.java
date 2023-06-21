package programing1project;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] array = {5, 2, 8, 3, 1};
        sortArray(array);
        printArray(array);
    }
    
    public static void sortArray(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

	}

}
