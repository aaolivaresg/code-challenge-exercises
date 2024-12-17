package org.leetcode.stringcompression;

public class StringCompression {

    public static void main(String args[]){
        StringCompression stringCompression = new StringCompression();
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(stringCompression.compress(chars));
    }

    public int compress(char[] chars) {

        int writePointer = 0; // Dónde escribir en el arreglo
        int readPointer = 0;  // Para recorrer el arreglo original

        while (readPointer < chars.length) {
            char currentChar = chars[readPointer]; // Caracter actual
            int count = 0;

            // Contar cuántas veces se repite el carácter actual
            while (readPointer < chars.length && chars[readPointer] == currentChar) {
                readPointer++;
                count++;
            }

            // Escribir el carácter en la posición del puntero de escritura
            chars[writePointer++] = currentChar;

            // Si el contador es mayor a 1, escribir el número como caracteres
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[writePointer++] = c;
                }
            }
        }

        return writePointer; // Nueva longitud del arreglo comprimido
    }
}
