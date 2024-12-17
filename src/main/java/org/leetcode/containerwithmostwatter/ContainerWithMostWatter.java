package org.leetcode.containerwithmostwatter;

public class ContainerWithMostWatter {

    public static void main(String args[]){
        ContainerWithMostWatter containerWithMostWatter = new ContainerWithMostWatter();
        int[] height = {1,8,6,2,5,4,3,3,8};

        System.out.println(containerWithMostWatter.maxArea(height));
    }

    public int maxArea(int[] height) {

        int init = 0;
        int end = height.length-1;
        int maxArea = 0;



        while(init<end){
            if(height[init]>height[end]){
                int area = (end-init) * height[end];
                if(maxArea < area)
                    maxArea = area;
                end--;
            }else{
                int area = (end-init)*height[init];
                if(maxArea < area)
                    maxArea = area;

                init++;
            }
        }
        return maxArea;
    }
}
