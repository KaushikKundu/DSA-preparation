package Sorting;
import java.util.Arrays;
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3,2};
        int[] ans = cyclicsort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] cyclicsort(int[] arr){
        int i=0;
       while (i < arr.length){
           int correctIndex = arr[i] -1;
           if(arr[i] != i+1){
               swap(arr, i, correctIndex);
           }else {
               i++;
           }
       }
        return arr;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
   //
}
