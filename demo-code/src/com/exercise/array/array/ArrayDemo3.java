package com.exercise.array.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[][] datas = {
                {0, 2, 2, 4},
                {2, 2, 4, 4},
                {0, 8, 2, 4},
                {0, 32, 0, 64}
        };
        //遍历二维数组，得到一个一维数组
        for (int i = 0; i < datas.length; i++) {
            int[] newArr = new int[4];
            //定义一个变量用来表示新数组的索引
            int index = 0;
            //循环遍历一维数组
            for (int x = 0; x < datas[i].length; x++) {
                //判断数组元素是否等于0
                if (datas[i][x] != 0) {
                    //将arr数组的元素赋值给newArr新数组保存
                    newArr[index] =datas[i][x];
                    index++;
                }
            }
            //将newArr数组赋值给datas[i]一维数组(赋值地址值)
            datas[i] = newArr;

            for (int x = 0; x < 3; x++) {
                if (datas[i][x] == datas[i][x + 1]) {
                    datas[i][x] *= 2;

                    //后续元素前移，并在末尾补0
                    for (int j = x + 1; j < 3; j++) {
                        datas[i][j] =datas[i][j+1];
                    }
                }
                datas[i][3] = 0;
            }
        }
        //遍历数组
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                System.out.print(datas[i][j]+" ");
            }
            System.out.println();
        }
    }
}
