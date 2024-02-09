package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        String str = "abc";
        recurPermute("",str);
        //ArrayList<String> list = recurPermute("",str);
        //System.out.println(list);
    }
    static void recurPermute(String p, String up ){
        if(up.isEmpty()){
            //ArrayList<String> list = new ArrayList<>();
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        //ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            String l = p.substring(0,i);
            String r = p.substring(i);

        recurPermute(l + ch + r,up.substring(1));
        }

    }
}
