package ii_observer.i_weatherstation.ii_weatherstation_first;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
