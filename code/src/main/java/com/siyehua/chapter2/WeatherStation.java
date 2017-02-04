package com.siyehua.chapter2;

/**
 * Created by huangxk on 2017/2/3.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditonsDisplay currentConditonsDisplay = new CurrentConditonsDisplay();
        weatherData.addObserver(currentConditonsDisplay);
        weatherData.setData(10, 20, 30);
        weatherData.setData(11, 22, 30);
        weatherData.setData(10, 20, 33);
    }
}
