package com.javase.观察者模式.第二版观察者可拉取数据;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 显示最小、平均和最大的温度观测值布告栏
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    // 主题对象
    private Observable observable;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;//记录观测的次数以便计算平均温度值


    /**
     * 布告栏的构造方法, 在主题中注册为观察者
     * 此处的主题为任意主题, 传入谁表示注册称为该主题的观察者
     */
    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.print("显示最小、平均和最大的温度观测值布告栏: ");
        System.out.println("平均/最大/最小的 温度 = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            float temp = weatherData.getTemp();
            tempSum += temp;
            numReadings++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }
            display();
        }
    }
}
