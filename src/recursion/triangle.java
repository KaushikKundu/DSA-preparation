package recursion;

public class triangle {
    static void lowerTriangle(int r, int c){
        if(r == 0){
            return ;
        }
        else if(c <= r){
            System.out.print("*");
            lowerTriangle(r,c+1);
        }else{
            System.out.println();
            lowerTriangle(r-1,1);
        }
    }
    public static void main(String[] args) {
        lowerTriangle(4,1);
    }
}
