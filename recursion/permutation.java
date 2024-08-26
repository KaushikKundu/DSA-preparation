package recursion;
public class permutation {
    public static void main(String[] args) {
        String str = "abc";
        solve("",str);
    };
    private static void solve(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<= p.length(); i++){
            String l = p.substring(0,i);
            String r = p.substring(i);
            solve(l+ch+r,up.substring(1));
        }
    }
}
