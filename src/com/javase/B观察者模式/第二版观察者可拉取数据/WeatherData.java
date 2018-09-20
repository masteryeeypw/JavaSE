package com.javase.B观察者模式.第二版观察者可拉取数据;

import java.util.Observable;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 实现主题接口的天气类
 */
public class WeatherData extends Observable {

    // 温度
    private float temp;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void measurementsChanged() {
        setChanged();
        // 在调用下面方法时, 先调用setChanged指示状态已改变
        // 有参数则全部推送
        notifyObservers("我现在把条数据全部推送给你们");
        // 没有参数则是拉取
        notifyObservers();
    }

    /**
     * 此方法为气象总站的数据修改通知气象站函数, 是修改此气象站数据的方法, 为外部所调用
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
