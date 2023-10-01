package ii_observer.i_weatherstation.ii_weatherstation_first;

public class ForecastDisplay implements Observer, DisplayElement {
	private Subject weatherData;
	// private float lastTemperature, currentTemperature;
	// private float lastHumidity, currentHumidity;
	private float lastPressure, currentPressure;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		// this.lastTemperature = this.currentTemperature;
		// this.currentTemperature = temperature;

		// this.lastHumidity = this.currentHumidity;
		// this.currentHumidity = humidity;
		
		this.lastPressure = this.currentPressure;
		this.currentPressure = pressure;
		
		this.display();
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
