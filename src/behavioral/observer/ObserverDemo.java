package behavioral;

public class ObserverDemo {

    public static void main(String[] args) {

        ConcreateSubject o = new ConcreateSubject();

        ConcreateObserver dispaly1 = new ConcreateObserver();
        ConcreateObserver dispaly2 = new ConcreateObserver();

        o.addObserver(dispaly1);
        o.addObserver(dispaly2);

        o.setMeasurement(45.5f, 34.4f);
        o.setMeasurement(89.5f, 12.2f);
    }
}
