package org.leetcode.longestones;

public class LongestOnes {

        public static void main(String args[]){
            LongestOnes longestOnes = new LongestOnes();
            int[] nums = {1,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,1,0};
            int k = 4;
            System.out.println(longestOnes.longestOnes(nums, k));
        }

        public int longestOnes(int[] nums, int k) {
            int left = 0; // Inicio de la ventana
            int maxLength = 0; // Longitud máxima de la ventana
            int zerosCount = 0; // Número de ceros en la ventana actual

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

            return maxLength; // Devolvemos la longitud máxima
        }
}
