package creational.singleton;

public class LazySingleTone {

    private LazySingleTone() {
    }
    //Volatile - keyword ensures that changes to the instance
              // variable are immediately visible to other threads.
    private static volatile LazySingleTone INSTANCE;

    // 1. Thread safe LazySingleTone - Synchronized ensures that only one
    //                              thread can perform the check and create the object

//    public static synchronized LazySingleTone getInstance(){
//
//        //it checks if Instance is null new instance will be created
//        if(INSTANCE == null){
//            INSTANCE = new LazySingleTone();
//        }
//
//        return INSTANCE;
//    }

    // OR --------------


    //2. Double-Checked Locking = thread safe

    //Volatile - keyword ensures that changes to the instance variable are immediately visible to other threads.
    // in short - no cache will be used for INSTANCE variable

    static LazySingleTone getDoubleCheckedInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleTone.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleTone();
                }
            }
        }
        return INSTANCE;
    }




    public void instanceCreated() {
        System.out.println("INSTANCE CREATED");
    }


}
