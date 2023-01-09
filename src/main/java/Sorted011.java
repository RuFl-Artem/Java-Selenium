import java.util.Arrays;

import static java.lang.System.out;

public class Sorted011 {
    public static void main(String[] args) {
        int[] nums = {2, 8, 0, 23, 5, 8, 1, 3, 6, 132, 24};
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i+1]) {
                    temp = nums[i];
                    out.println(temp);
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                    out.println(Arrays.toString(nums));
                }
            }
        }
        out.println("Отсортировано! " + Arrays.toString(nums));
    }
}
