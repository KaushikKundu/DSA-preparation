import java.util.* ;
import java.io.*;
public class secondLargest{
    public static void main(String[] args) {
        int[] arr = {-10 -40 -25 -12 -25 -10};
        int n  = arr.length;
        int ans = findSecondLargest(n,arr);
        System.out.println(ans);
    }

        // Write your code here.
        public static int findSecondLargest(int n, int[] arr) {
            // Write your code here.
            int second = Integer.MIN_VALUE;
            int largest = arr[0];
            boolean secondCheck = false;
            int check = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > largest) {
                    second = largest;
                    largest = arr[i];
                    check++;

                }else if(arr[i] > second && arr[i] != largest){
                    second = arr[i];
                    check++;

                }

            }
            if (check < 1 || largest== second) {
                second = -1;
            }
            return second;
        }

    }

