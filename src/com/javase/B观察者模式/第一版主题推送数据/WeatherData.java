package com.javase.B观察者模式.第一版主题推送数据;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 实现主题接口的天气类
 */
public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();
    // 温度
    private float temp;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }


    /**
     * 此方法为气象总站的数据修改通知气象站函数, 是修改此气象站数据的方法, 为外部所调用
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

}
