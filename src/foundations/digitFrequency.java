package foundations;
import java.util.*;

public class digitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }
    public static int getDigitFrequency(int n, int d) {
        // write code here
        int r=0;
        int count = 0;
        while(n != 0){
            r = n % 10;
            n /= 10;
            if (r == d) {
                count++;
            }
        }
        return count;
    }
}