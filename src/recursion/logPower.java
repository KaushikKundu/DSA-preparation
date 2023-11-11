package recursion;

public class logPower {
    public static void main(String[] args) {
        int ans = powerLog(2, 8);
        System.out.println(ans);
    }
    static int powerLog(int base, int power){
        if(power == 0){
            return 1;
        }
        if(power % 2 == 0){
            return powerLog(base, power/2)*powerLog(base, power/2);
        }
        return powerLog(base, power/2)*powerLog(base, power/2)*base;
    }
}
