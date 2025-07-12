package learning.designPatterns.observer.impl;

import learning.designPatterns.observer.interfaces.Device;
import learning.designPatterns.observer.interfaces.Observer;
import learning.designPatterns.observer.interfaces.Subject;

public class MobileDisplay implements Device, Observer {
    private final WeatherSubject weatherSubject;

    public MobileDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    public void removeObserver() {
        weatherSubject.removeObserver(this);
    }

    @Override
    public void display() {
        // Implementation for mobile display
        System.out.println("Updating mobile display...");
    }

    @Override
    public void update(Subject subject, Object arg) {
        System.out.println("Updates received from subject "+subject.getClass().getSimpleName());
        WeatherData weatherData = (WeatherData) arg;
        System.out.println("Temperature: "+weatherData.getTemperature());
        System.out.println("Humidity: "+weatherData.getHumidity());
        System.out.println("Pressure: "+weatherData.getPressure());
        display();
    }
}
