package ii_observer.i_weatherstation.ii_weatherstation_first;

public class HeatIndexDisplay implements Observer, DisplayElement {
	private Subject weatherData;
	private float heatIndex;

	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.heatIndex = (float)((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity) 
			+ (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity)) 
			+ (0.000345372 * (temperature * temperature * humidity)) - (0.000814971 * (temperature * humidity * humidity)) +
			(0.0000102102 * (temperature * temperature * humidity * humidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 * 
			(humidity * humidity * humidity)) + (0.00000142721 * (temperature * temperature * temperature * humidity)) + 
			(0.000000197483 * (temperature * humidity * humidity * humidity)) - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
			0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
			(0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));

		this.display();
	}

	public void display() {
		System.out.println("Heat index: " + this.heatIndex);
	}
}
