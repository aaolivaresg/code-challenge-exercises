package org.leetcode.rotatearray;

public class RotateArray {
    
    public static void main(String args[]){
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    private void rotate(int[] nums, int k){
        int n = nums.length;
        k %= n; // Aseguramos que k no exceda el tamaño del arreglo

        // Variables auxiliares para realizar la rotación
        int count = 0; // Contador de elementos procesados
        int start = 0; // Inicio del ciclo

        while (count < n) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % n; // Calculamos la próxima posición
                int temp = nums[next]; // Guardamos el valor en la posición siguiente
                nums[next] = prev; // Asignamos el valor previo a la nueva posición
                prev = temp; // Actualizamos el valor previo
                current = next; // Movemos el índice actual
                count++; // Incrementamos el número de elementos procesados
            } while (current != start); // Si volvemos al inicio, cerramos el ciclo

            start++; // Cambiamos de inicio para manejar posibles ciclos independientes
        }

        System.out.println(java.util.Arrays.toString(nums));
    }

    /*
    private void rotate(int[] nums, int k) {

        //1,2,3,4,5,6,7
        //5 6 7          |
        //k=3
        //temp=7
        //rotations=2
        int i = nums.length-k-1;
        int rotations = k;
        int rotations2 = 0;
        int temp = 0;

        while (rotations>0 || i>=0){
            int tempi = nums[i];
            int tempn = nums[nums.length-rotations];
            nums[nums.length-rotations2-1]=tempi;
            nums[i] = tempn;
            rotations--;
            i--;
        }

        System.out.println(java.util.Arrays.toString(nums));
    }*/
}
