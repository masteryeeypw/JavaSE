package com.javase.E单例模式;

/**
 * Created by Yipw on 2018/9/21 0021.
 * 懒汉式单例模式, 线程安全
 */
public class LazySafeSingle {
    private static LazySafeSingle lazySafeSingle;
    private LazySafeSingle() {

    }
    public static synchronized LazySafeSingle getInstance() {
        if (null == lazySafeSingle) {
            System.out.println("CREATE");
            lazySafeSingle = new LazySafeSingle();
        }
        return lazySafeSingle;
    }
}
