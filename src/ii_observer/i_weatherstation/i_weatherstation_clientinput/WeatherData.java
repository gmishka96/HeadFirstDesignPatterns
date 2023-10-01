package ii_observer.i_weatherstation.i_weatherstation_clientinput;

public class WeatherData {
	// instance variable declarations

	public void measurementsChanged() {
		float temperature = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();

		// currentConditionsDisplay.update(temperature, humidity, pressure);
		// statisticsDisplay.update(temperature, humidity, pressure);
		// forecastDisplay.update(temperature, humidity, pressure);

		System.out.println(
			"Temperature: " + temperature +
			"\nHumidity: " + humidity +
			"\nPressure: " + pressure);
	}

	private float getTemperature() {
		return 0.1F;
	}

	private float getHumidity() {
		return 0.2F;
	}

	private float getPressure() {
		return 0.3F;
	}

	// other WeatherData methods here
}
