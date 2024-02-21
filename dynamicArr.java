import java.util.Arrays;

public class dynamicArr {
    public static void main(String[] args) {
       int[][] arr = {
               {1, 4, 6,3},
               {3,0},
               {9,2,94}
       };
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                System.out.println(arr[row][col]);
            }
        }

    }
}
