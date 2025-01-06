package org.leetcode.removeelement;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {1};
        int val = 1;

        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {


        // Puntero para colocar los elementos que no son igual a val
        int k = 0;

        // Recorremos el arreglo
        for (int i = 0; i < nums.length; i++) {
            // Si el elemento actual no es igual a val, lo movemos a la posición k
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // Incrementamos el puntero k
            }
        }

        // Retornamos la cantidad de elementos que no son iguales a val
        return k;
    }
}
