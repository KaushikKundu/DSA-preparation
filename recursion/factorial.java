package recursion;

public class factorial {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return factorial(n-1) * n;

    }
}
