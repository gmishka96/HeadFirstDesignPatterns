package ii_observer.i_weatherstation.iii_weatherstation_javautil;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Observable weatherData;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			this.display();
		}
	}
	
	public void display() {
		System.out.println(
			"Temperature (\u00B0C): " + this.temperature +
			"\nHumidity (%): " + this.humidity +
			"\nPressure (hPa): " + this.pressure);
	}
}
