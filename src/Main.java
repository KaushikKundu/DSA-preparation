import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,5,7},{3,0,1,6}};
        Scanner in = new Scanner(System.in);
        //int input = in.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}