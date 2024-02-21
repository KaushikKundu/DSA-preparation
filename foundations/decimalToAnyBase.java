package foundations;

import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int b = scn.nextInt();
        int f = decimalToAnyBase(d,b);
        System.out.println(f);
    }
    static int decimalToAnyBase(int d, int b){
        //divide repeatedly by base and store each remainder
        //update the d with
        int r=0;
        int i=0;
        int ans = 0;
        while(d != 0){
            r = d % b;
            d = d / b;

            ans = (int) (ans + r*(Math.pow(10,i)));
            i++;
        }
        return  ans;
    }
}
