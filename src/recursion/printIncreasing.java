package recursion;

public class printIncreasing {
    public static void main(String[] args) {
        int i=1;
        print1ton(5);
    }
    static void print1ton(int n){
        if(n ==0 ){
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }
}
