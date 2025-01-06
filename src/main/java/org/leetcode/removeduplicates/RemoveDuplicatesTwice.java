package org.leetcode.removeduplicates;

public class RemoveDuplicatesTwice {

    public static void main(String args[]) {
        int[] nums = {1,2,3,4,4,5,5,5,6,7,8,8,8,9};
        RemoveDuplicatesTwice removeDuplicates = new RemoveDuplicatesTwice();
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }

    private int removeDuplicates(int[] nums) {

        // Puntero para colocar los elementos que no son igual al anterior
        int k = 1;
        int count = 1;
        //{1,1,2,3,4,4,5,5,6,6,8,8,5,5,6,6,6,8,8,8};
        //k                        |
        //i                                      |
        //count = 3
        // Recorremos el arreglo

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]== nums[i-1]){
                count++;
                if(count==2){
                    nums[k] = nums[i];
                    k++;
                }

            }else{
                count = 1;
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Array without duplicates: "+java.util.Arrays.toString(nums));
        // Retornamos la cantidad de elementos que no son iguales al anterior
        return k;
    }
}
