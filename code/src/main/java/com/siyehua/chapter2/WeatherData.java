package com.siyehua.chapter2;

import java.util.Observable;

/**
 * Created by huangxk on 2017/2/3.
 */
public class WeatherData extends Observable {

    private float tmperature = 0f;
    private float humidity = 0f;
    private float pressure = 0f;
//    private CopyOnWriteArrayList<Observer> observers = new CopyOnWriteArrayList<>();

//    @Override
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void removeObserve(Observer observer) {
//        observers.remove(observer);
//
//    }
//
//    @Override
//    public void notifyObserves() {
//        for (Observer observer : observers) {
//            observer.update(getTemperature(), getHumidity(), getPressure());
//        }
//    }


    public float getTemperature() {
        return tmperature;

    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;

    }

    public void measuedrmentsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setData(float tmperature, float humidity, float pressure) {
        this.tmperature = tmperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuedrmentsChanged();
    }


}
