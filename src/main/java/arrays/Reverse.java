package arrays;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] a = {1, 3,5,9,10,12,99};
        int i = 0, j = a.length - 1, temp;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}

