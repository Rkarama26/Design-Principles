package behavioral;

import java.util.ArrayList;
import java.util.List;

public class ConcreateSubject implements Subject{

    private List<Observer> observers;
    private float temprature;
    private float humidity;

    public ConcreateSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeOberser(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObserver() {
      for(Observer o : observers){
          o.update(temprature, humidity);
      }
    }

    public void setMeasurement(float temprature, float humidity){
        this.temprature = temprature;
        this.humidity = humidity;
        notifyObserver();
    }
}
