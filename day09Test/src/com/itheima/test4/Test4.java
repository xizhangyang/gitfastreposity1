package com.itheima.test4;

import java.util.Random;

/*
分析以下需求，并用代码实现
		1.创建两个长度为5的数组，数组内元素为随机生成的1-100之间的偶数。
		2.定义一个方法unionArr(描述如下)，传入两个数组，方法中将两个数组元素合并到一个新数组中，并且将新数组的内容打印到控制台上
	              public static int[] unionArr(int[] arr1,int[] arr2)
	              功能: 两个数组的元素存入到一个新数组中并返回
	       3.程序运行结果(因为数字随机生成，这里只是举个例子：)
	              原数组1：[78, 48, 20,94, 34]
	              原数组2：[32, 10, 98,4, 52]
              合并后数组：[78, 48, 20, 94, 34, 32, 10, 98, 4, 52]
 */
public class Test4 {
    public static void main(String[] args) {
        //创建数组
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        //生成数组
        creatArray(arr1);
        creatArray(arr2);

        //打印数组
        System.out.print("原数组1：");
        printArray(arr1);
        System.out.print("原数组2：");
        printArray(arr2);

        //数组合并
        int[] arr3 = unionArr(arr1,arr2);
        System.out.print("合并后数组：");
        printArray(arr3);

    }

    public static int[] unionArr(int[] arr1, int[] arr2) {
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

    public static void printArray(int[] arr) {
        //遍历数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //判断是不是最后一个元素
            if(i == arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }

    public static void creatArray(int[] arr) {
        //创建随机数对象
        Random r = new Random();

        //产生随机数,存入数组
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100)+1;
            //判断num是不是偶数,如果是将随机数存入数组
            if(num %2 ==0){
                arr[i] =num;
            }else{
                //如果是奇数,让索引回到以前的位置
                i--;
            }
        }
    }
}
