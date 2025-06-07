package behavioral.observer;

public class ConcreateObserver implements Observer {

    private float temprature;
    private float humidity;


    @Override
    public void update(float t, float h) {
        this.temprature = t;
        this.humidity = t;
        display();
    }


    public void display(){
        System.out.println("temperature : " +temprature + ", "+ "humidity "+ humidity);
    }
}
