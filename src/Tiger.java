public class Tiger extends Animal implements Walk
{
    private int numberOfStripes;
    private double speed;
    private int soundLevelOfRoar;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public Tiger() {
        // Calls the parent class constructor with "Tiger"
        super("Tiger");
    }

    // Getter and setter for speed
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Getter and setter for soundLevelOfRoar
    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println( "Tiger: I am walking at the speed "+ speed+" mph");
    }
}
