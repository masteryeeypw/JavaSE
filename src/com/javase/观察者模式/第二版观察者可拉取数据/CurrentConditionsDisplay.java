package com.javase.观察者模式.第二版观察者可拉取数据;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 显示当前温度,湿度的布告栏, 实现观察者和布告栏接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    // 主题对象
    private Observable observable;
    // 温度
    private float temperature;
    // 湿度
    private float humidity;

    /**
     * 布告栏的构造方法, 在主题中注册为观察者
     * 此处的主题为任意主题, 传入谁表示注册称为该主题的观察者
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.print("当前温度,湿度的布告栏: ");
        System.out.println("当前温度: " + temperature + ", 当前湿度: "+humidity);
    }

    @Override
    public void update(Observable observable, Object object) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
        }

        System.out.println("推送" + object);
        display();
    }
}
