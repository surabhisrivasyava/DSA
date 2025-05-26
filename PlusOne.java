import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just add one and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set to 0 and continue to carry
            digits[i] = 0;
        }

        // If all digits are 9 (e.g., 999), we need a new array
        int[] result = new int[n + 1];
        result[0] = 1; // Set first digit to 1, rest are 0 by default
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
