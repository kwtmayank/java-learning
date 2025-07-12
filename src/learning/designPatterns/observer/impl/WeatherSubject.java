package learning.designPatterns.observer.impl;

import learning.designPatterns.observer.interfaces.Observer;
import learning.designPatterns.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    private WeatherData weatherData;
    private final List<Observer> weatherObservers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        weatherObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        weatherObservers.forEach(observer -> observer.update(this, weatherData));
    }

    public void setWeather(double temperature, double humidity, double pressure) {
        System.out.println("Weather has changed");
        System.out.println("Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
        weatherData = new WeatherData(temperature, humidity, pressure);
        System.out.println("Notifying observers");
        notifyObservers();
    }
}
