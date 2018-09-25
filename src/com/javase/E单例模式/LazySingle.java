package com.javase.E单例模式;

/**
 * Created by Yipw on 2018/9/21 0021.
 * 懒汉式的单例模式(线程不安全)
 * 所谓的懒汉式表示的是 在用户使用该对象时才开始第一次创建对象
 */
public class LazySingle {

    private static LazySingle lazySingle;

    /**
     * 私有, 类就不会实例化, 不能new
     */
    private LazySingle() {}

    public static LazySingle getInstance() {
        if (null == lazySingle) {
            System.out.println("CREATE");
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }

}


