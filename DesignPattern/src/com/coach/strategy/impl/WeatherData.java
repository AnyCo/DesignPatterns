package com.coach.strategy.impl;

import com.coach.strategy.inter.Observer;
import com.coach.strategy.inter.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers; //存放观察者列表
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
        observers = new ArrayList();
    }

    //添加观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除观察者
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

}
