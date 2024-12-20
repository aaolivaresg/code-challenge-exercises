package org.leetcode.maxvowels;

public class MaxVowels {
    
    public static void main(String args[]) {
        MaxVowels maxVowels = new MaxVowels();
        System.out.println(maxVowels.maxVowels("juigigiiugiugiuuuuiij", 2));

    }

    public int maxVowels(String s, int k) {

        int maxNumberOfVowels = 0;
        int numberOfVowels = 0;

        for(int i = 0 ; i < k ; i++){
            if("aeiou".indexOf(s.charAt(i)) != -1)
                numberOfVowels++;
        }

        maxNumberOfVowels = numberOfVowels;

        for(int i = k ; i < s.length() ; i++){
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(i-k));
            if("aeiou".indexOf(s.charAt(i)) != -1)
                numberOfVowels++;
            if("aeiou".indexOf(s.charAt(i-k)) != -1)
                numberOfVowels--;

            if(numberOfVowels>maxNumberOfVowels)
                maxNumberOfVowels = numberOfVowels;
        }

        return maxNumberOfVowels;
    }
    /*
    public int maxVowels(String s, int k) {

        String subStringK = "";
        long maxNumberOfVowels = 0;

        int end = k-1;

        for(int i = 0 ; i < s.length() ; i ++){
            subStringK+=s.charAt(i)+"";

            if(i>=end){

                long numberOfVowels = subStringK.chars() // Convierte la cadena en un IntStream
                        .filter(c -> "aeiou".indexOf(c) != -1) // Filtra los caracteres que coinciden
                        .count();
                if(numberOfVowels>maxNumberOfVowels)
                    maxNumberOfVowels = numberOfVowels;
                //System.out.println(subStringK.charAt(start));
                subStringK = subStringK.replaceFirst(subStringK.substring(0,1), "");
                //System.out.println(subStringK);
                //start++;
            }


        }
        return (int)maxNumberOfVowels;
    }*/
}
