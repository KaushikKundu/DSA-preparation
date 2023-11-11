package recursion;

public class power {
    public static void main(String[] args) {
        int ans = power(2, 4);
        System.out.println(ans);
    }
    static int power(int base, int power){
        if(power == 0){
            return 1;
        }
        return power(base,power - 1) * base;
    }
}
