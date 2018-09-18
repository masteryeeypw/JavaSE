package com.javase.观察者模式.第一版主题推送数据;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 观察者模式中的主题对象, 理解为发布报纸的报社
 */
public interface Subject {


    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 当主题有数据更新时, 调用此方法
     */
    void notifyObservers();

    /**
     * 此方法为气象总站的数据修改通知气象站函数, 是修改此气象站数据的方法, 为外部所调用
     * @param temp
     * @param humidity
     * @param pressure
     */
    void setMeasurements(float temp, float humidity, float pressure);

}
