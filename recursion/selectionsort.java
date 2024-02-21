package recursion;

import java.util.Arrays;

public class selectionsort {
    static void selection(int[] arr, int r, int c){
        if(r == 0){
            return ;
        }
        else if(c < r){
            if(arr[c] > arr[r]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
                selection(arr, r,c+1);


        }else{
            selection(arr,r-1,0);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8, 3, 2, 0, 4};
        selection(arr, arr.length -1,0); // r = no of elements/ no of passes
        System.out.println(Arrays.toString(arr));
    }
}
