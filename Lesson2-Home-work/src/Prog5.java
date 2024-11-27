import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] arr1 = {5,6,-4,3,1};
        int[] arr2 = {3,8,9,11};

        System.out.println(Arrays.toString(combine(arr1, arr2)));
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int resultIndex = 0;

        for (int j : arr1) {
            result[resultIndex] = j;
            resultIndex++;
        }
        for (int j : arr2) {
            result[resultIndex] = j;
            resultIndex++;
        }
        return result;
    }
}
