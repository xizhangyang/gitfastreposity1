package com.itheima.test3;
/*
分析以下需求，并用代码实现：
	     什么是水仙花数呢?
	所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	举例：153就是一个水仙花数。
	153 = 1*1*1 + 5*5*5 + 3*3*3
	要求:
	       1.定义方法public static boolean isSXH(int num)
	        功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
			2.借助1中定义的方法实现判断数据是否为水仙花数,在控制台2个一行输出所有的水仙花数，最后打印水仙花的总个数。
 */
public class Test3 {
    public static void main(String[] args) {
        //定义统计变量
        int count =0;
        //获取三位数
        for (int i = 100; i < 1000; i++) {
            //定义方法判断是不是水仙花数
            boolean flag = isSXH(i);
            //判断是不是返回true,如果为true则是水仙花数
            if(flag == true){
                System.out.print(i+" ");
                count++;
                //两个换行
                if(count %2 ==0){
                    System.out.println();
                }
            }
        }
        System.out.println("个数:"+count);
    }

    public static boolean isSXH(int num) {  //123
        //获取个位数十位数和百位数
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100;

        //判断
        if(ge*ge*ge +shi*shi*shi+ bai*bai*bai == num){
            return true;
        }else{
            return false;
        }

    }
}
