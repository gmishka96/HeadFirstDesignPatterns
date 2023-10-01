package ii_observer.i_weatherstation.ii_weatherstation_first;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
	private Subject weatherData;
	private List<Float> temperatures;
	private List<Float> humidities;
	private List<Float> pressures;

	public StatisticsDisplay(Subject weatherData) {
		this.temperatures = new ArrayList<Float>();
		this.humidities = new ArrayList<Float>();
		this.pressures = new ArrayList<Float>();
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperatures.add(temperature);
		this.humidities.add(humidity);
		this.pressures.add(pressure);
		this.display();
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
