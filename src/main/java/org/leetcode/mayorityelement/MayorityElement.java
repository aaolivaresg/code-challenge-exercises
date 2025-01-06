package org.leetcode.mayorityelement;

import java.util.HashMap;

public class MayorityElement {

    public static void main(String args[]){
        int[] nums = {3,2,2,1,1,1,1,1,4,4,4,4,4,4,43};
        MayorityElement mayorityElement = new MayorityElement();
        System.out.println(mayorityElement.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)!=null?map.get(num)+1:1);
            }else {
                map.put(num,1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return 0;
    }
}
