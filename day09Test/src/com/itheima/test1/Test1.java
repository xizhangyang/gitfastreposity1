package com.itheima.test1;
/*
31.【代码题】反馈
1.定义一个抽象类Door（门），具有开open( )和close（）方法，无返回值，无参数
2.定义防盗门TheftoroofDoor类，具有普通门的开和关的功能，同时还有上锁功能、开锁功能;
3.创建测试类Test01,在main方法中测试以上功能，打印格式如下：

轻轻拉门，门关上了。
插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。
插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。
用力推，门打开了。
 */
public class Test1 {
    public static void main(String[] args) {
        //创建对象
        TheftoroofDoor door = new TheftoroofDoor();
        //调用方法
        door.close();
        door.shangSuo();
        door.kaiSuo();
        door.open();
    }
}
