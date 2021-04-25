import java.util.Arrays;

public class Solution2 {
   private static final int[] arr = new int[8];

    public static void main(String[] args) {


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
