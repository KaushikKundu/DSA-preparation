package foundations;
import java.util.Scanner;
public class fiboSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printFibonacci(input);
    }
    static void printFibonacci(int n){
        int x = 0,y = 1,nextNum;
        System.out.println(0);
        System.out.println(1);
        if(n>=2){
            for (int i=1;i<=n-2;i++){
                 nextNum = x + y;
                System.out.println(nextNum);
                x = y;
                y = nextNum;

            }
        }
    }
}
