package foundations;

import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printPrimeFactor(input);
    }
    static void printPrimeFactor(int n){
        int flag = 0;
        for (int i = 2; i <= n ; i++) {
            if(n % i == 0){ // checking factors
                for (int j = 2; j < i; j++) { // checking prime factors
                    if(i % j == 0){
                        flag = 1;
                        break;
                    }

                }
                if(flag == 0){
                    System.out.println(i);
                }
                //System.out.println(i);
            }
        }
    }
}
