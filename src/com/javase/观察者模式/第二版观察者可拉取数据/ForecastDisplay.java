package com.javase.观察者模式.第二版观察者可拉取数据;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 天气预报布告栏
 */
public class ForecastDisplay implements Observer, DisplayElement {

    // 主题对象
    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    /**
     * 布告栏的构造方法, 在主题中注册为观察者
     * 此处的主题为任意主题, 传入谁表示注册称为该主题的观察者
     */
    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.print("天气预报布告栏: ");
        if (currentPressure > lastPressure) {
            System.out.println("天气正在改善, 气压有所下降");
        } else if (currentPressure == lastPressure) {
            System.out.println("气压依旧");
        } else if (currentPressure < lastPressure) {
            System.out.println("提防阴冷多雨的天气, 气压有所上升");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.lastPressure = weatherData.getPressure();
            this.currentPressure = weatherData.getPressure();
        }
        display();
    }
}