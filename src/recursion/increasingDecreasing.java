package recursion;
public class increasingDecreasing {
    public static void main(String[] args) {

    }
    static void printIncreasingDecreasing(int n){
       if(n == 0){
           return;
       }
       printIncreasingDecreasing(n-1);
        System.out.println(n);

    }
}
