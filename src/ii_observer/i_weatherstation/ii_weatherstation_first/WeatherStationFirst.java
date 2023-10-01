package ii_observer.i_weatherstation.ii_weatherstation_first;

public class WeatherStationFirst {
	public static void run() {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(25, 65, 30.4f);
		weatherData.setMeasurements(26, 70, 30.1f);
		weatherData.setMeasurements(24, 60, 30.7f);
	}
}
