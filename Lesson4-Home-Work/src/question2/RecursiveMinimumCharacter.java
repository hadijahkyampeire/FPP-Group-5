package question2;

public class RecursiveMinimumCharacter {
    public static void main(String[] args) {
        RecursiveMinimumCharacter finder = new RecursiveMinimumCharacter();
        String input = "akel";

        try {
            char minChar = finder.findMinChar(input);
            System.out.println("The minimum character in \"" + input + "\" is: '" + minChar + "'");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public char findMinChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty.");
        }
        return findMinCharHelper(str, 0, str.charAt(0));
    }

    private char findMinCharHelper(String str, int index, char minChar) {
        // Base case: If we've reached the end of the string, return the minimum Character
        if (index == str.length()) {
            return minChar;
        }

        // Update minChar if the current character is smaller in alphabet
        if (str.charAt(index) < minChar) {
            minChar = str.charAt(index);
        }

        // Recursive call to process the next character
        return findMinCharHelper(str, index + 1, minChar);
    }
}
