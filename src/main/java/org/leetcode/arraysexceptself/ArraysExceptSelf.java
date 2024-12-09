package org.leetcode.arraysexceptself;

public class ArraysExceptSelf {

    public static void main(String[] args) {
        int[] nums = {4, 9, 3, 0};

        ArraysExceptSelf arraysExceptSelf = new ArraysExceptSelf();
        int[] result = arraysExceptSelf.productExceptSelf(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        // Arreglos para prefijos y sufijos
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] answer = new int[n]; // Resultado final

        // Calcular productos de prefijos
        prefix[0] = 1; // No hay elementos a la izquierda del primer índice
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Calcular productos de sufijos
        suffix[n - 1] = 1; // No hay elementos a la derecha del último índice
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Calcular el resultado combinando prefijos y sufijos
        for (int i = 0; i < n; i++) {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }
}
