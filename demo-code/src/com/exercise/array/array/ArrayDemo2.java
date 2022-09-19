package com.exercise.array.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 0};
        for (int x = 0; x < 3; x++) {
            if (arr[x] == arr[x + 1]) {
                arr[x] *= 2;

                //后续元素前移，并在末尾补0
                for (int j = x + 1; j < 3; j++) {
                    arr[j] = arr[j+1];
                }
            }
            arr[3] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
