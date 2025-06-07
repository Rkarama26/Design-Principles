package creational.singleton;

public class EagerRegistry {


    private EagerRegistry() {

    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }


    public void instanceCreated() {
        System.out.println(" EAGER INSTANCE CREATED");
    }


}
