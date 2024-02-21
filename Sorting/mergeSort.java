package Sorting;

import java.util.Arrays;

public class mergeSort {
    static int[] merge(int[] left, int[] right){
        int[] newArr = new int[left.length + right.length];
        int l=0;
        int r=0;
        int k =0;
        while(l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                newArr[k] = left[l];
                l++;
            } else {
                newArr[k] = right[r];
                r++;
            }
            k++;
        }
        while (l < left.length){
            newArr[k] = left[l];
            l++;
            k++;
        }
        while (r < right.length) {
            newArr[k] = right[r];
            r++;
            k++;
        }
        return newArr;
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] first= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8, 3, 2, 0, 4};
        int[] ans = mergeSort(arr); // r = no of elements/ no of passes
        System.out.println(Arrays.toString(ans));
    }
}
