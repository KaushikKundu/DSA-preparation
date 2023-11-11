package recursion;

public class nTo1 {
    public static void main(String[] args) {
        printNto1(5);
    }
    static int printNto1(int n){
        if(n >0){
            System.out.println(n);
            return printNto1(--n);
        }
        return 0;
    }
}
