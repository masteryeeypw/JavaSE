package com.javase.B观察者模式.第一版主题推送数据;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 显示当前温度,湿度的布告栏, 实现观察者和布告栏接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    // 主题对象
    private Subject weatherData;
    // 温度
    private float temperature;
    // 湿度
    private float humidity;

    /**
     * 布告栏的构造方法, 在主题中注册为观察者
     * 此处的主题为任意主题, 传入谁表示注册称为该主题的观察者
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 如果想取消为该主题的观察者, 可调用此方法取消观察(订阅)
     */
    public void removeObserver() {
        weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.print("当前温度,湿度的布告栏: ");
        System.out.println("当前温度: " + temperature + ", 当前湿度: "+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
