package arrays;

public class MoveZeroesToEnd {
        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static void moveZeroes(int[] nums) {
            int insertIndex = 0;

            // Move all non-zero elements to the front of the array
            for (int num : nums) {
                if (num != 0) {
                    nums[insertIndex++] = num;
                }
            }

            // Fill the remaining elements with zeroes
            while (insertIndex < nums.length) {
                nums[insertIndex++] = 0;
            }
        }
}
