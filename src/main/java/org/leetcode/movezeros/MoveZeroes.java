package org.leetcode.movezeros;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String args[]){
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 0, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {


        int j = 0;

        for(int i =0; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;

            }
        }

        for(int i: nums){
            System.out.println(i);
        }
    }
}
