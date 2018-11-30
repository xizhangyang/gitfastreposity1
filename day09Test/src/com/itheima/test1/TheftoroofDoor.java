package com.itheima.test1;
/*
2.定义防盗门TheftoroofDoor类，具有普通门的开和关的功能，同时还有上锁功能、开锁功能;
 */
public class TheftoroofDoor extends Door{

    //重写的抽象方法
    @Override
    public void open() {
        System.out.println("用力推，门打开了。");
    }

    @Override
    public void close() {
        System.out.println("轻轻拉门，门关上了。");
    }

    public void shangSuo() {
        System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。");
    }

    public void kaiSuo() {
        System.out.println("插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。");
    }

}
