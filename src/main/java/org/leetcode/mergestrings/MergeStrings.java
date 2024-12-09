package org.leetcode.mergestrings;

public class MergeStrings {

    public static void main(String[] args) {
        String s1 = "abcsss";
        String s2 = "defkkkkkkkkkk";
        System.out.println(mergeStrings(s1, s2));
    }

    public static String mergeStrings(String word1, String word2){

        int index = 0;
        StringBuilder mergeString = new StringBuilder();

        while (index < word1.length() && index < word2.length()) {
           mergeString.append(word1.charAt(index)).append(word2.charAt(index));
            index++;
        }

        if(index>=word1.length()){
            mergeString.append(word2.substring(index));
        }
        if(index>=word2.length()){
            mergeString.append(word1.substring(index));
        }


        return mergeString.toString();

    }
}
