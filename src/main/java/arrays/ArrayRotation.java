package arrays;

public class ArrayRotation {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int x = 2;

            // Rotate the array
            rotateLeft(arr, x);

            // Print the rotated array
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void rotateLeft(int[] arr, int x) {
            int n = arr.length;

            // Normalize x to handle cases where x > n
            x = x % n;

            // Reverse the first x elements
            reverse(arr, 0, x - 1);

            // Reverse the remaining elements
            reverse(arr, x, n - 1);

            // Reverse the entire array
            reverse(arr, 0, n - 1);
        }

        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}
