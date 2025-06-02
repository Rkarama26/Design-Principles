package behavioral.strategy;

// ---strategy interface for walk
interface WalkableRobot{
    public void walk();
}

// concrete implementation for walk
class NormalWalk implements WalkableRobot{

    @Override
    public void walk() {
        System.out.println("Walking normally...");
    }
}

// concrete implementation for walk
class NotWalk implements WalkableRobot{

    @Override
    public void walk() {
        System.out.println("Cannot walk...");
    }
}

// ---strategy interface for talk
interface TalkableRobot{
    void talk();
}
// concrete implementation for talk
class NormalTalk implements TalkableRobot{

    @Override
    public void talk() {
        System.out.println("Talking Normally... ");
    }
}
// concrete implementation for talk
class NotTalk implements TalkableRobot {

    @Override
    public void talk() {
        System.out.println("cannot talk... ");
    }
}
//  ---strategy interface for Fly
interface Flyable{
    void fly();
}

// concrete implementation for Fly
class NormalFly implements Flyable{

    @Override
    public void fly() {
        System.out.println("Flying Normally... ");
    }
}

// concrete implementation for Fly
class NotFly implements Flyable{

    @Override
    public void fly() {
        System.out.println("cannot fly...");
    }
}


public abstract class Robot {
    private WalkableRobot walkableRobot;
    private TalkableRobot talkableRobot;
    private Flyable flyable;

    public Robot(Flyable flyable, TalkableRobot talkableRobot, WalkableRobot walkableRobot) {
        this.flyable = flyable;
        this.talkableRobot = talkableRobot;
        this.walkableRobot = walkableRobot;
    }

    void walk(){
        walkableRobot.walk();
    }
    void talk() {
        talkableRobot.talk();
    }
    void fly(){
        flyable.fly();
    }

    abstract void projection();

}

class CampanionRobot extends Robot{

    public CampanionRobot(Flyable flyable, TalkableRobot talkableRobot, WalkableRobot walkableRobot) {
        super(flyable, talkableRobot, walkableRobot);
    }

    @Override
    void projection() {
        System.out.println("Displaying friendly Companion features");
    }
}

class Worker extends Robot{

    public Worker(Flyable flyable, TalkableRobot talkableRobot, WalkableRobot walkableRobot) {
        super(flyable, talkableRobot, walkableRobot);
    }

    @Override
    void projection() {
        System.out.println("Displaying friendly Worker features");
    }
}


