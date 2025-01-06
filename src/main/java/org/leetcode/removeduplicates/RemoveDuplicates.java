package org.leetcode.removeduplicates;

public class RemoveDuplicates {

    public static void main(String args[]) {
        int[] nums = {1, 1,1,1,1,1, 2, 3, 4, 4, 4,5,5,5,6,6,6,8,8,8};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }

    private int removeDuplicates(int[] nums) {

        // Puntero para colocar los elementos que no son igual al anterior
        int k = 0;

        // Recorremos el arreglo
        for (int i = 0; i < nums.length; i++) {
            // Si el elemento actual no es igual al anterior, lo movemos a la posición k
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++; // Incrementamos el puntero k
            }
        }

        System.out.println("Array without duplicates: "+java.util.Arrays.toString(nums));
        // Retornamos la cantidad de elementos que no son iguales al anterior
        return k;
    }
}
