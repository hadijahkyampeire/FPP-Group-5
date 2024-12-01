package question3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursiveReverseArrayTest {
    RecursiveReverseArray reverseArray = new RecursiveReverseArray();

    @Test
    public void testReverseArray_NullArray_ShouldThrowException() {
        int n = 5;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            reverseArray.reverseArray(null, n);
        });

        assertEquals("Invalid input parameters.", exception.getMessage());
    }

    @Test
    public void testReverseArray_NGreaterThanArrayLength_ShouldThrowException() {
        int[] array = {1, 2, 3, 4, 5};
        int n = 6; // Greater than array length

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            reverseArray.reverseArray(array, n);
        });

        assertEquals("Invalid input parameters.", exception.getMessage(),
                "Exception message should match for n greater than array length.");
    }

    @Test
    public void testReverseArray_ValidArrayInputAndNEqualsArrayLength() {
        int[] array = {1, 3, 5, 7, 9, 13};
        int n = array.length;

        int[] expected = {13, 9, 7, 5, 3, 1};

        reverseArray.reverseArray(array, n);
        assertArrayEquals(expected, expected, "The array should be reversed correctly.");
    }

    @Test
    public void testReverseArray_ValidInput_ShouldReverseFirstNElements() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int n = 3;

        // Expected array after reversing only the first 3 elements
        int[] expected = {3, 2, 1, 4, 5, 6};

        reverseArray.reverseArray(array, n);

        assertArrayEquals(expected, array, "The first n elements of the array should be reversed correctly.");
    }
}