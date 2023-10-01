package ii_observer.i_weatherstation.iii_weatherstation_javautil;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private Observable weatherData;
	private List<Float> temperatures;
	private List<Float> humidities;
	private List<Float> pressures;

	public StatisticsDisplay(Observable weatherData) {
		this.temperatures = new ArrayList<Float>();
		this.humidities = new ArrayList<Float>();
		this.pressures = new ArrayList<Float>();
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temperatures.add(weatherData.getTemperature());
			this.humidities.add(weatherData.getHumidity());
			this.pressures.add(weatherData.getPressure());
			this.display();
		}
	}
	
	public void display() {
		System.out.println(
			"Avg/max/min temperature (\u00B0C): " +
			getAverageTemperature() + "/" +
			getMaxTemperature() + "/" +
			getMinTemperature());
	}
	
	private float getAverageTemperature() {
		float sum = 0.0f;

		for (Float temperature : this.temperatures) {
			sum += temperature;
		}

		return sum / this.temperatures.size();
	}
	
	private float getMaxTemperature() {
		float maxTemperature = this.temperatures.get(0);

		for (Float temperature : this.temperatures) {
			if (temperature > maxTemperature) {
				maxTemperature = temperature;
			}
		}

		return maxTemperature;
	}
	
	private float getMinTemperature() {
		float minTemperature = this.temperatures.get(0);

		for (Float temperature : this.temperatures) {
			if (temperature < minTemperature) {
				minTemperature = temperature;
			}
		}

		return minTemperature;
	}
}
