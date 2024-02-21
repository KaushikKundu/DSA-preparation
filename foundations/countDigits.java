package foundations;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ans = countDigits(input);
        System.out.println(ans);
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
