public class secondlargest {

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 33};

        Integer largest = null;
        Integer secondLargest = null;

        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if ((secondLargest == null || num > secondLargest) && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest != null) {
            System.out.println("Second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
