public class ThirdLargest {

    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array must contain at least three elements.");
            return -1; // Indicate error
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("No third largest element found (not enough distinct elements).");
            return -1;
        }

        return third;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = findThirdLargest(arr);

        if (result != -1) {
            System.out.println("The third largest element is: " + result);
        }
    }
}