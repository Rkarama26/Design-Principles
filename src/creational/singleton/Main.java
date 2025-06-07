package creational.singleton;

public class Main {

    public static void main(String[] args) {

        // We can't do this, because constructor is private
        //EagerRegistry instance = new EagerRegistry();

        // 1. Eager initialization
        // we accessed it through the static method
//        EagerRegistry instance0 = EagerRegistry.getInstance();
//        EagerRegistry instance1 = EagerRegistry.getInstance();
//        instance1.instanceCreated();
//
//        System.out.println(instance0 == instance1);


        // 2. Lazy Initialization
//        LazySingleTone instace2 = LazySingleTone.getDoubleCheckedInstance();
//        LazySingleTone instace3 = LazySingleTone.getDoubleCheckedInstance();
//
//        System.out.println(instace2 == instace3);


       // BillPushSingleTone instance = BillPushSingleTone.getInstance();



    }
}
