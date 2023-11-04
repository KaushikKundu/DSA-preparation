package foundations;

public class firstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20,30,40,40,40,40,50,60,100};
        int target = 40;
        int firstIndex = findFirstIndex(arr,target);
        int lastIndex = findLastIndex(arr,target);
        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }
    static int findFirstIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
       int firstIndex = -1;
        while (start <= end){
            int mid = (start + end)/2;
            if(target > arr[mid] ){
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            }
            else{
              firstIndex = mid;
              end = mid - 1;
            }
        }
        return  firstIndex;
    }
    static  int findLastIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int lastIndex = -1;
        while (start <= end){
            int mid = (start + end)/2;
            if(target > arr[mid] ){
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            }
            else{
               lastIndex = mid;
               start = mid + 1;
            }
        }
        return  lastIndex;
    }
}
