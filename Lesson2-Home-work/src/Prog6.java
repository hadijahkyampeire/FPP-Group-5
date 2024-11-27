public class Prog6 {
    public static void main(String[] args) {
        int[] arr = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22, -1, -2};
        System.out.println(secondMin(arr));
    }

    public static int secondMin(int[] arrayOfInts) {
        int min = arrayOfInts[0];
        int secondMin = arrayOfInts[0];

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < min) {
                secondMin = min;
                min = arrayOfInts[i];
            }
        }
        return secondMin;
    }
}
