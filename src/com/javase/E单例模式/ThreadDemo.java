package com.javase.E单例模式;

/**
 * Created by Yipw on 2018/9/21 0021.
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        try {
            //LazySingle.getInstance();
            LazySafeSingle.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
