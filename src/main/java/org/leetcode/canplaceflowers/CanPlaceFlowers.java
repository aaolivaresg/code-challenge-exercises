package org.leetcode.canplaceflowers;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {0,0,0,0,0,1};
        int n = 2;

        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n){

        int maxLength = flowerbed.length;

        for(int i = 0 ; i<maxLength ; i++){
            if (flowerbed[i] == 0) {
                boolean prev = (i == 0 || flowerbed[i - 1] == 0);
                boolean next = (i == maxLength - 1 || flowerbed[i + 1] == 0);

                if (prev && next) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }

   /* public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i= 0; i < flowerbed.length; i++){
           if(flowerbed.length > i+1
                   && flowerbed[i]==0
                   && flowerbed[i+1]==0
           && flowerbed.length > i+2
           && flowerbed[i+2]==0){
                flowerbed[i+1] = 1;
               n--;

           }
        }

        return n <= 0;
    }*/


}
