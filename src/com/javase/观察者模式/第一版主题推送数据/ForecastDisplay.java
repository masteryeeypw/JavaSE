package com.javase.观察者模式.第一版主题推送数据;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 天气预报布告栏
 */
public class ForecastDisplay implements Observer, DisplayElement {

    // 主题对象
    private Subject weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    /**
     * 布告栏的构造方法, 在主题中注册为观察者
     * 此处的主题为任意主题, 传入谁表示注册称为该主题的观察者
     * @param weatherData
     */
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
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
}