package com.siyehua.chapter2;

import java.util.*;

/**
 * Created by huangxk on 2017/2/3.
 */
public class CurrentConditonsDisplay implements java.util.Observer, DisplayElement {
    private float tmperature, humidity, pressure;

    public CurrentConditonsDisplay() {
    }

    @Override
    public void display() {
        System.out.println("目前状况\n" + "温度: " + tmperature + "\n湿度: " + humidity + "\n气压: " +
                pressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            this.tmperature = ((WeatherData) observable).getTemperature();
            this.humidity = ((WeatherData) observable).getHumidity();
            this.pressure = ((WeatherData) observable).getPressure();
            display();
        }
    }

}
