import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String[] arr = {"horse", "dog", "cat", "horse", "dog"};
        System.out.println(Arrays.toString(noDubs(arr)));
    }

    public static String[] noDubs(String[] arr) {
        String[] noDups = new String[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }

            boolean isDup = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (noDups[j] != null && noDups[j].equals(arr[i])) {
                    isDup = true;
                    break;
                }
            }

            if (!isDup) {
                noDups[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        String[] finalArr = new String[uniqueCount];
//        System.arraycopy(noDups, 0, finalArr, 0, uniqueCount); OR
        for (int i = 0; i < uniqueCount; i++) {
            finalArr[i] = noDups[i];
        }

        return finalArr;
    }
}
