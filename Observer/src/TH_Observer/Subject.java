package TH_Observer;

public interface Subject  {
    void attachObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
