package com.coach.strategy.test;

import com.coach.strategy.impl.CurrentConditionDisplay;
import com.coach.strategy.impl.ForecastDisplay;
import com.coach.strategy.impl.StatisticsDisplay;
import com.coach.strategy.impl.WeatherData;

public class WeatherStation {

    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("==========================================================");
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("==========================================================");
        weatherData.setMeasurements(72,64,30.1f);
    }

}
