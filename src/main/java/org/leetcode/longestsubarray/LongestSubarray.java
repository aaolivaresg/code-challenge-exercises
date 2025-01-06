package org.leetcode.longestsubarray;

public class LongestSubarray {

    public static void main(String args[]){
        LongestSubarray longestSubarray = new LongestSubarray();
        int[] nums = {1,1,0,0,1,1,1,0,1};
        System.out.println(longestSubarray.longestSubarray(nums));
    }
    public int longestSubarray(int[] nums) {

        int left = 0; // Inicio de la ventana
        int maxLength = 0; // Longitud máxima de la ventana
        int zerosCount = 0; // Número de ceros en la ventana actual
        int k = 1;
        // Iteramos con el puntero derecho sobre el arreglo
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerosCount++; // Contamos el 0
            }

            // Si el número de ceros excede k, movemos el puntero izquierdo
            System.out.println("zeros:"+ zerosCount);
            while (zerosCount > k) {
                System.out.println( zerosCount );
                if (nums[left] == 0) {

                    zerosCount--; // Reducimos el conteo de ceros
                }
                left++; // Movemos la ventana hacia adelante
            }

            System.out.println(right +"-" +left);
            // Actualizamos la longitud máxima de la ventana
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength-1; // Devolvemos la longitud máxima
    }
}
