public class binary_search {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;

        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                System.out.println("Element found at index: " + middle);
                found = true;
                break;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}