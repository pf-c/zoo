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
        System.out.println(getNameOfAnimal() + " is walking at " + speed + " km/h.");
    }

    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + " is eating meat.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + " has finished eating.");
    }
}
