package com.itheima.test2;
/*
1.定义字符串:String scrStr= "java woaijava,i like jajavava i enjoy java"
2.定义字符串String delStr= "java"
3.要求
删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
4.代码运行打印格式:
       控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like  i enjoy
 */
public class Test2 {
    public static void main(String[] args) {
        //定义字符串
        String scrStr= "java woaijava,i like jajavava i enjoy java";
        String delStr= "java";

        //定义统计变量
        int count =0;
        //循环判断大串中是否包含小串
        while(scrStr.contains(delStr)){
            //从大串中把小串替换掉
            scrStr = scrStr.replaceFirst("java","");  //注意:将替换后的字符串赋值给源字符串woai,i like java i enjoy
            count++;
        }

        System.out.println("源字符串中总共包含:"+count+" 个 "+delStr+" 删除"+delStr+"后的字符串为:"+scrStr);
    }
}
