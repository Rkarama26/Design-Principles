package creational.singleton;


public class BillPushSingleTone {

    private BillPushSingleTone(){
        System.out.println("BillPushSingleTone constructor called... ");
    }

    private static class SinglToneHelper {
        // final keyword ensures Instance cannot be reassigned.
        private static final BillPushSingleTone INSTANCE = new BillPushSingleTone();

    }

    public static BillPushSingleTone getInstance(){
        System.out.println("Bill Push SingleTone instance created");
        return SinglToneHelper.INSTANCE;
    }
}
