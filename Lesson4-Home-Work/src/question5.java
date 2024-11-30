public class question5 {
    public static void main(String[] args) {
        // array to test
        int[] arr = {5, -3, 6, 1, 9, 4};

        // Start recursion from the first index (0)
        int maxValue = findMaxValue(arr, 0);
        System.out.println("Max value: " + maxValue);
    }

    // Recursive function to find the maximum value in the array
    public static int findMaxValue(int[] arr, int index) {
        // Base case: if we reach the last element
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursive case: get the maximum value from the remaining array
        int maxInRemaining = findMaxValue(arr, index + 1);

        // Compare the current element with the maximum from the rest of the array
        if (arr[index] > maxInRemaining) {
            return arr[index]; // Current element is greater
        } else {
            return maxInRemaining; // Maximum from the rest is greater
        }
    }
}