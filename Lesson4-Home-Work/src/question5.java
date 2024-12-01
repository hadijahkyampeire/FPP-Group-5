public class question5 {
    public static void main(String[] args) {
        // array to test
        int[] arr = {5, -3, 6, 1, 9, 4};

        int maxValue = maxValue(arr);
        System.out.println("Max value: " + maxValue);
    }

    public static int maxValue(int arr[]) {
        return findMaxValue(arr, 0, Integer.MIN_VALUE);
    }

    private static int findMaxValue(int arr[], int index, int max) {
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return findMaxValue(arr, index + 1, max);
    }

    // OR ...........
    // Recursive function to find the maximum value in the array
//    public static int findMaxValue(int[] arr, int index) {
//        // Base case: if we reach the last element
//        if (index == arr.length - 1) {
//            return arr[index];
//        }
//
//        // Recursive case: get the maximum value from the remaining array
//        int maxInRemaining = findMaxValue(arr, index + 1);
//
//        // Compare the current element with the maximum from the rest of the array
//        if (arr[index] > maxInRemaining) {
//            return arr[index]; // Current element is greater
//        } else {
//            return maxInRemaining; // Maximum from the rest is greater
//        }
//    }

}
