package ii_observer.i_weatherstation.ii_weatherstation_first;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int index = this.observers.indexOf(observer);
		if (index >= 0) {
			this.observers.remove(index);
		}
	}

	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}

	public float getPressure() {
		return this.pressure;
	}
}
