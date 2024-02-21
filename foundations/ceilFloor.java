package foundations;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class ceilFloor {
    public static void main(String[] args) {
        int[] arr = {10, 20,30,40,50,60,70,80,90,100};
        int target = 45;
         findCeilingFloor(arr,target);

    }
    static void findCeilingFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        while (start <= end){
            int mid = (start + end)/2;
            if(target > arr[mid] ){
                start = mid + 1;
                floor = arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
                ceil = arr[mid];
            }
            else{
               ceil = arr[mid];
               floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
