package com.think.第五章初始化与清理;

/**
 * @Author MASTERYEE
 * @Date 2018/11/14 20:51
 **/
public class Dog {
    Bowl bowl;
    Bowl bow2;
    {
        // 优于构造器执行，且每次创建对象都会执行
        bowl = new Bowl(1);
        bow2 = new Bowl(2);
    }
    Dog() {

    }
}
