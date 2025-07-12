package learning.designPatterns.observer;

import learning.designPatterns.observer.impl.WeatherSubject;
import learning.designPatterns.observer.impl.MobileDisplay;

public class Main {
    public static void main(String[] args) {
        // Create the subject (observable)
        WeatherSubject weatherStation = new WeatherSubject();
        
        // Create observers
        MobileDisplay mobileDisplay = new MobileDisplay(weatherStation);
        
        // Register observers
        weatherStation.registerObserver(mobileDisplay);
        
        // Simulate weather change
        weatherStation.setWeather(25.0, 50.0, 1013.0);
    }
}
