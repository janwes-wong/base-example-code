package com.exercise.array.array;

//逆时针旋转数组
public class UnClockwise {
    public static void main(String[] args) {
        int[][] datas = {
                {2, 2, 2, 2},
                {4, 4, 4, 4},
                {8, 8, 8, 8},
                {32, 32, 32, 32}
        };
        int[][] newArr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newArr[j][3-i] = datas[i][j];
            }
        }
        datas = newArr;

        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                System.out.print(datas[i][j]+" ");
            }
            System.out.println();
        }
    }
}
