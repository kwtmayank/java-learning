package learning.designPatterns.observer.interfaces;


public interface Subject {
    public boolean changed = false;
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
