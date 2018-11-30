package com.itheima.test4;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        //创建数组
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        //创建随机数对象
        Random r = new Random();

        //产生随机数,存入数组arr1
        for (int i = 0; i < arr1.length; i++) {
            int num = r.nextInt(100)+1;
            //判断num是不是偶数,如果是将随机数存入数组
            if(num %2 ==0){
                arr1[i] =num;
            }else{
                //如果是奇数,让索引回到以前的位置
                i--;
            }
        }

        //遍历数组arr1
        System.out.print("原数组1：[");
        for (int i = 0; i < arr1.length; i++) {
            //判断是不是最后一个元素
            if(i == arr1.length-1){
                System.out.println(arr1[i]+"]");
            }else{
                System.out.print(arr1[i]+",");
            }
        }

        //产生随机数,存入数组arr2
        for (int i = 0; i < arr2.length; i++) {
            int num = r.nextInt(100)+1;
            //判断num是不是偶数,如果是将随机数存入数组
            if(num %2 ==0){
                arr2[i] =num;
            }else{
                //如果是奇数,让索引回到以前的位置
                i--;
            }
        }

        //遍历数组arr2
        System.out.print("原数组2：[");
        for (int i = 0; i < arr2.length; i++) {
            //判断是不是最后一个元素
            if(i == arr2.length-1){
                System.out.println(arr2[i]+"]");
            }else{
                System.out.print(arr2[i]+",");
            }
        }

        //数组合并
        //定义新的数组
        int[] arr3 =new int[arr1.length + arr2.length];

        //将arr1中的元素存入新数组
        for (int i = 0; i < arr1.length; i++) {   //arr1 = {80,40,80,44,46}
            arr3[i] = arr1[i];          //arr3={80,40,80,44,46,0,0,0,0,0}
        }

        //将arr2中的元素存入新数组
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] =  arr2[i];
        }

        //遍历数组arr3
        System.out.print("合并后数组：[");
        for (int i = 0; i < arr3.length; i++) {
            //判断是不是最后一个元素
            if(i == arr3.length-1){
                System.out.println(arr3[i]+"]");
            }else{
                System.out.print(arr3[i]+",");
            }
        }

    }
}
