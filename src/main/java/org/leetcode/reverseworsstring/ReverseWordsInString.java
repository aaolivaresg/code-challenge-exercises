package org.leetcode.reverseworsstring;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "a good   example";
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        System.out.println(reverseWordsInString.reverseWords(s));
    }

    public String reverseWords(String s) {


        if (s == null || s.length() == 0) {
            return "";
        }

        String words [] =s.split(" ");

        StringBuilder reverseWords = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            if(words[i].equals("")){
                continue;
            }
            reverseWords.append(words[i]+" ");
        }

        return reverseWords.toString().trim();
    }
}
