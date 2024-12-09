package org.leetcode.stringsdivisor;

import java.util.HashMap;

public class StringDivisor {

    public static void main(String[] args) {
        String str1 = "abcsss";
        String str2 = "abcs";

        gcdOfStrings(str1, str2);

    }


    public static String gcdOfStrings(String str1, String str2) {

        HashMap<String, Integer> map = new HashMap<>();

        int index = 0;
        System.out.print("Common characters: ");
        if(str1.length() < str2.length()){

            while( index < str1.length() ) {
                String temp = str1.substring(0, index);
                if(str2.contains(temp)){
                    if(map.containsKey(temp)){
                        map.put(temp, map.get(temp) + 1);
                    }else{
                        map.put(temp, 1);
                    }
                }
                index++;
            }

        }else{
            while( index < str2.length() ) {
                String temp = str2.substring(0, index);
                if(str1.contains(temp)){
                    if(map.containsKey(temp)){
                        map.put(temp, map.get(temp) + 1);
                    }else{
                        map.put(temp, 1);
                    }
                }
                index++;
            }
        }

        //print map
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        return "";
    }
}
