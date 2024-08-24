import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subArr("", str));
    };
    private static void subseq(String p, String up) {
        if(up.isEmpty()){
            System.out 
            .println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
        
    };
    private static ArrayList<String> subArr(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subArr(p+ch,up.substring(1));
        ArrayList<String> right = subArr(p,up.substring(1));
        left.addAll(right);
        return left;
        
    }
}
