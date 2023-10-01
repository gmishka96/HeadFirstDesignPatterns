package ii_observer.i_weatherstation.ii_weatherstation_first;

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
