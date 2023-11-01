package foundations;

import java.util.Scanner;
import java.lang.Math;

public class rotateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int rotate = sc.nextInt();
        int ans = rotateNumber(input,rotate);
        System.out.println(ans);
    }
    static int rotateNumber(int n, int k){

        int ans = 0;
        int length = countDigits(n);
        //System.out.println(length);
        int lastPart = (int) (n % Math.pow(10,k));
        int firstPart = (int) (n / Math.pow(10,k));
        int multiplier = (int) Math.pow(10,length-k);
        ans = lastPart * multiplier + firstPart;
        return  ans;
    }
    static int countDigits(int n){
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
}
