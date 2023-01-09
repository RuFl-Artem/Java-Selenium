import java.util.Arrays;

public class Iskluch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 33, 4, 0, 5};
        try {
            System.out.println("Начало");
            nums[6] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
           System.out.println("Error!");
            System.out.println(exc);
            System.out.println(Arrays.toString(nums));
        }
    }
}
