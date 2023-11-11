package recursion;

public class printZigzag {
    public static void main(String[] args) {
        zigzag(5);
    }
    static void zigzag(int n){
        if(n == 1){
            System.out.print(1);
        }
        else if (n == 0){
            return;
        }
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
    }
}
