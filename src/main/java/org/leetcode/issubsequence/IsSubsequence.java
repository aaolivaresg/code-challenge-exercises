package org.leetcode.issubsequence;

public class IsSubsequence {

    public static void main(String args[]){
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("abc", "aasdfasdfasdfbc"));
    }

    public boolean isSubsequence(String s, String t) {

        int i = 0;

        if(s.isEmpty())
            return false;

      for(int j = 0; j < t.length(); j++){

            if(i<s.length() && s.charAt(i) == t.charAt(j)){
                i++;
            }
        }
        return i == s.length();
    }
}
