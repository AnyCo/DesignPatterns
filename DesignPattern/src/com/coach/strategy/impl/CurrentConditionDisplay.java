package com.coach.strategy.impl;

import com.coach.strategy.inter.DisplayElement;
import com.coach.strategy.inter.Observer;
import com.coach.strategy.inter.Subject;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private Subject weatherData;
    private float temp;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); //将当前对象注册到观察者列表
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }

    //更新后display
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = temp;
        display();
    }
}
