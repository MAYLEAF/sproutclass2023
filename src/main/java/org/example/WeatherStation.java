package org.example;


import org.example.observer.CurrentConditionsDisplay;
import org.example.observer.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
            new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
