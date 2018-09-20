package com.javase.B观察者模式.第一版主题推送数据;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 显示最小、平均和最大的温度观测值布告栏
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    // 主题对象
    private Subject weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;//记录观测的次数以便计算平均温度值


    /**
     * 布告栏的构造方法, 在主题中注册为观察者
     * 此处的主题为任意主题, 传入谁表示注册称为该主题的观察者
     * @param weatherData
     */
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    //这属于“推”数据，本类只使用到了第一个参数
    @Override
    public void update(float temp, float humidity, float pressure) {
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

    @Override
    public void display() {
        System.out.print("显示最小、平均和最大的温度观测值布告栏: ");
        System.out.println("平均/最大/最小的 温度 = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
