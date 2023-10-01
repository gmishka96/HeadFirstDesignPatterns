package ii_observer.i_weatherstation.ii_weatherstation_first;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Subject weatherData;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}
	
	public void display() {
		System.out.println(
			"Temperature (\u00B0C): " + this.temperature +
			"\nHumidity (%): " + this.humidity +
			"\nPressure (hPa): " + this.pressure);
	}
}
