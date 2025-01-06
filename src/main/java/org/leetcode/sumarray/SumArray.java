package org.leetcode.sumarray;

import java.util.Arrays;

public class SumArray {


    public static void main(String[] args) {
        SumArray sumArray = new SumArray();
        sumArray.merge( new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n ){

        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2>=0) {
            if(nums1[p1]>nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
                p--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

        System.out.println(Arrays.toString(nums1));




    }

   /* public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;

        while(i < m){
            if(nums1[i] >= nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                j++;
            }

            if(nums1[i] == 0)
                break;
            i++;

        }


            while(i < (m+n) && j < n){
                nums1[i] = nums2[j];
                i++;
                j++;
            }


        //imprimir nums1 en una sola linea
       System.out.println(Arrays.toString(nums1));
    }*/
}
