package com.itheima.test4;

import java.util.Arrays;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        //创建数组
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        //产生随机数存入数组
        //创建随机数对象
        Random r = new Random();

        //产生随机数,存入数组arr1
        for (int i = 0; i < arr1.length; i++) {
            //产生1-100之间的偶数
            int num = (r.nextInt(50)+1)*2;
            //将偶数存入数组中
            arr1[i] =num;
        }
        //打印arr1中的每个元素
        System.out.println("原数组1："+ Arrays.toString(arr1));


        //产生随机数,存入数组arr2
        for (int i = 0; i < arr2.length; i++) {
            //产生1-100之间的偶数
            int num = (r.nextInt(50)+1)*2;
            //将偶数存入数组中
            arr2[i] =num;
        }
        //打印arr2中的每个元素
        System.out.println("原数组2："+ Arrays.toString(arr2));


        //数组合并
        int[] arr3 = unionArr(arr1,arr2);
        //打印arr3中的每个元素
        System.out.println("合并后的数组："+ Arrays.toString(arr3));
    }

    private static int[] unionArr(int[] arr1, int[] arr2) {
        //数组合并
        //定义新的数组
        int[] arr3 =new int[arr1.length + arr2.length];

        //将arr1中的元素存入新数组
        for (int i = 0; i < arr1.length; i++) {   //arr1 = {80,40,80,44,46}
            arr3[i] = arr1[i];                   //arr3={80,40,80,44,46,0,0,0,0,0}
        }

        //将arr2中的元素存入新数组
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] =  arr2[i];
        }
        return arr3;
    }
}
