package org.leetcode.increasingtripplesubsequence;

public class IncreasingTripleSubsequence {

    public static void main(String args[]){
        IncreasingTripleSubsequence increasingTripleSubsequence = new IncreasingTripleSubsequence();
        int[] nums = {1, 5, 2, 3, 4};
        System.out.println(increasingTripleSubsequence.increasingTriplet(nums));
    }
    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // Actualiza el menor número
            } else if (num <= second) {
                second = num; // Actualiza el segundo menor número
            } else {
                return true; // Encontramos un triplete (first, second, num)
            }
        }

        return false;
    }
}
