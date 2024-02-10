package twoPointers;

import java.util.regex.Pattern;
class Solution {
    public static void main(String[] args) {
        String s =
        "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        StringBuffer str = new StringBuffer();
        for (char ch : s.toCharArray()
             ) {
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }
        String st = str.toString().toLowerCase();
        for (int i = 0; i < st.length() ; i++) {
            if(st.charAt(i) != st.charAt(st.length() -1 -i))
                return false;
        }
        return true;
    }

}