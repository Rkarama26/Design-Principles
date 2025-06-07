package behavioral.observer;

public interface Subject {

    void addObserver(Observer o);

    void removeOberser(Observer o);

    void notifyObserver();
}
