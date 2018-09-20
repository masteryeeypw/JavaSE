package com.javase.B观察者模式.第一版主题推送数据;

/**
 * Created by Yipw on 2018/9/14 0014.
 */
public class TestWeather {

    public static void main(String[] args) {
        Subject weather = new WeatherData();
        // 注册为观察者
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weather);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weather);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weather);

        // 气象站更新数据
        weather.setMeasurements(27f, 11f, 12f);
        System.out.println("========================================================");
        weather.setMeasurements(21f, 99f, 25f);
        System.out.println("========================================================");
        weather.setMeasurements(35f, 31f, 66f);
    }

}
