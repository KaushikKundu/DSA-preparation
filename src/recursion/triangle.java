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
    static void upperTriangle(int r, int c) {
        if(r == 0){
            return ;
        }
        else if(c <= r){
            upperTriangle(r,c+1);
            System.out.print("*");

        }else{
            upperTriangle(r-1,1);
            System.out.println();
        }
    }
    public static void main(String[] args){
        //lowerTriangle(4,1);
        upperTriangle(4,1);
    }
}
