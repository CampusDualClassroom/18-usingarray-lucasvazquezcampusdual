package com.campusdual.classroom;

import com.campusdual.Utils;

public class Exercise {
    public static int[] createAndInitializeArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    public static void showInlineArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = Utils.integer("Introduce el tamaño del array");
        int[] array = createAndInitializeArray(n);
        showInlineArray(array);

    }
}
