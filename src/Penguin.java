public class Penguin extends Animal implements Walk , Swim{
    private boolean isSwimming;
    private int WalkingSpeed;
    private int swimmingSpeed;

    public boolean getSwimming() {
        return isSwimming;
    }
    public Penguin() {
        // Calls the parent class constructor with "Penguin"
        super("Penguin");
    }
    public void setSwimming(boolean swimming) {
        this.isSwimming = swimming;
    }

    public int getWalkingSpeed() {
        return WalkingSpeed;
    }

    public void setWalkingSpeed(int walkingSpeed) {
        WalkingSpeed = walkingSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish");
    }

    // Implement the method from Eat interface
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimmming() {
        System.out.println("Penguin: I am swimming at the speed of "+swimmingSpeed+" nautical miles per hour");
    }
    @Override
    public void walking() {
        System.out.println( "Penguin: I am walking at the speed "+ WalkingSpeed +" mph");
    }
}
