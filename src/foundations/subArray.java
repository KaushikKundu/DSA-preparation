package foundations;
import java.util.ArrayList;
import java.util.Arrays;

public class subArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //ArrayList<Integer> subArr = new ArrayList<>(arr.length);
        for(int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                for (int k=i; k<=j; k++) {
                    System.out.print((arr[k]));
                }
                System.out.println(" ");
            }

        }
    }
}
