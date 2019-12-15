package chaptertwo.firstiteration.test;

import chaptertwo.firstiteration.displayelements.CurrentConditionsDisplay;
import chaptertwo.firstiteration.displayelements.HeatIndexDisplayElement;
import chaptertwo.firstiteration.displayelements.StatisticsDisplay;
import chaptertwo.firstiteration.weatherdata.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplayElement heatIndexDisplay = new HeatIndexDisplayElement(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(85, 65, 30.4f);
        weatherData.setMeasurements(88, 90, 30.4f);

    }
}
