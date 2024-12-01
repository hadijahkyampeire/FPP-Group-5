package question3;

public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray reverser = new ReverseArray();
        int[] array = {1, 3, 5, 7, 9, 13};

        System.out.print("Before Reverse: ");
        reverser.printArray(array);

        reverser.reverseArray(array, array.length);

        System.out.print("After Reverse: ");
        reverser.printArray(array);
    }

    public void reverseArray(int[] arr, int n) {
        if (arr == null || n <= 0 || n > arr.length) {
            throw new IllegalArgumentException("Invalid input parameters.");
        }
        reverseHelper(arr, 0, n - 1);
    }
    private void reverseHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursion
        reverseHelper(arr, left + 1, right - 1);
    }

    // Helping out with printing the array
    public void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length -1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
