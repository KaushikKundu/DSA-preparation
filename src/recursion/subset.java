package recursion;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        //noOfSubset("","abc");
        ArrayList<String> arr = new ArrayList<>();

        System.out.println( arrOfSubset("","abc",arr));
    }
    static void noOfSubset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        noOfSubset(p+ch,up.substring(1));
        noOfSubset(p,up.substring(1));
    }
    static ArrayList<String> arrOfSubset(String p, String up,ArrayList<String> arr){
        if(up.isEmpty()){
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        arrOfSubset(p+ch,up.substring(1),arr);
        arrOfSubset(p,up.substring(1),arr);
        return arr;
    }
}
