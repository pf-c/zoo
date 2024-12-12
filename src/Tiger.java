public class Tiger extends Animal implements Walk {
    // Properties specific to Tiger
    private int numberOfStripes;
    private int speed;
    private int roarSoundLevel;

    // Default constructor
    public Tiger() {
        super("Tiger"); // Call the parent constructor with "Tiger"
    }

    // Getters and setters
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRoarSoundLevel() {
        return roarSoundLevel;
    }

    public void setRoarSoundLevel(int roarSoundLevel) {
        this.roarSoundLevel = roarSoundLevel;
    }
    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of " + speed + " mph");
    }
    // Implement the eatingCompleted() method from Eat interface
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }
}
