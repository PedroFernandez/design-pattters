package chaptertwo.firstiteration.displayelements;

import chaptertwo.firstiteration.interfaces.DisplayElement;
import chaptertwo.firstiteration.interfaces.Observer;
import chaptertwo.firstiteration.interfaces.Subject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    private ArrayList<Integer> temperatureValues;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        Random rand = new Random();

        temperatureValues = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            int value = rand.nextInt((80 - 10) + 1) + 1;
            temperatureValues.add(value);
        }

        int maxValue = Collections.max(temperatureValues);
        int minValue = Collections.min(temperatureValues);
        int avgValue = (maxValue + minValue) / 2;

        System.out.println("Avg/Max/Min temperature =" + avgValue + "/" + maxValue + "/"  + minValue);
    }

}
