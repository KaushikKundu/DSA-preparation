package foundations;
import java.util.Arrays;

public class inverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 0,3,1};
        int[] ans = new int[arr.length];
        int value;
        for (int i = 0; i < arr.length; i++) {
            //traverse for each index store the value at correct position
            value = arr[i];
            ans[value] = i;
        }
        System.out.println(Arrays.toString(ans));
    }
}
