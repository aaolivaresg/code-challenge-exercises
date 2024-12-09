package org.leetcode.reversevowels;

import static java.util.Collections.swap;

public class ReverseVowels {

    public static void main(String args[]){
        ReverseVowels reverseVowels = new ReverseVowels();
        System.out.println(reverseVowels.reverseVowels("leetcode"));

    }

    public String reverseVowels(String s) {

        int init = 0;
        int end = s.length() - 1;

        while (init < end) {

            if (isVowel(s.charAt(init)) && isVowel(s.charAt(end))) {
                s = swap(s, init, end);
                init++;
                end--;
            }else{
                if (!isVowel(s.charAt(init))) {
                    init++;
                }
                if (!isVowel(s.charAt(end))) {
                    end--;
                }
            }

        }
        return s;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convertir a minúscula para comparación uniforme
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

}
