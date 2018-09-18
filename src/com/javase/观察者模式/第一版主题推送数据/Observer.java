package com.javase.观察者模式.第一版主题推送数据;

/**
 * Created by Yipw on 2018/9/14 0014.
 * 观察者模式中的观察者, 理解为订阅报纸的客户
 */
public interface Observer {

    /**
     * 更新观察者数据的方法
     * @param temp      临时
     * @param humidity  湿度
     * @param pressure  压力
     */
    void update(float temp, float humidity, float pressure);

}
