package functionalinterfaces;

public class ArraySum {
        public static int calculateArraySum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }
}
