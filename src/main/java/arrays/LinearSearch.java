package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 9, 5, 1, 8};
        int target = 5;

        int index = linearSearch(nums, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                    return i;  // Element found, return its index
            }
        }
        return -1;  // Element not found in the array
    }
}



