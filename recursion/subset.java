package recursion;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        //noOfSubset("","abc");
        int[] arr = {1,2,3};
        List<List<Integer>> list = iterativeSubset(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //ArrayList<String> arr = new ArrayList<>();
        //System.out.println(iterativeSubset());
        //System.out.println( arrOfSubset("","abc",arr));
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
    static List<List<Integer>> iterativeSubset(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int num : arr){
            int n = list.size();
            for (int i = 0; i < n ; i++) {
                List<Integer> internal = new ArrayList<>(list.get(i));
                internal.add(num);
                list.add(internal);
            }
        }
        return list;
    }
}
