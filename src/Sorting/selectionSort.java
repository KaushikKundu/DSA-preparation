package Sorting;

public class selectionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here

        int temp = 0;
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
}

