package org.leetcode.maxnumberksubpairs;

import java.util.HashMap;

public class MaxNumberOfKSubpairs {

    public static void main(String args[]){
        int[] nums = {3,1,3,4,3};
        int k = 6;
        MaxNumberOfKSubpairs maxNumberOfKSubpairs = new MaxNumberOfKSubpairs();
        System.out.println(maxNumberOfKSubpairs.maxOperations(nums, k));
    }

    private int maxOperations(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;


        for (int num : nums) {
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                operations++;

                map.put(k - num, map.get(k - num) - 1);

            }else{
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }
}
