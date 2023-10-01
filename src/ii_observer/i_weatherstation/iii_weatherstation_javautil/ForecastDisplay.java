package ii_observer.i_weatherstation.iii_weatherstation_javautil;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private Observable weatherData;
	private float lastPressure, currentPressure;

	public ForecastDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			this.lastPressure = this.currentPressure;
			this.currentPressure = ((WeatherData)o).getPressure();
			this.display();
		}
	}
	
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
