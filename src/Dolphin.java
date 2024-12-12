public class Dolphin extends Animal implements Swim {
    // Properties specific to Dolphin
    private String colorOfDolphin;
    private int swimmingSpeed;

    // Default constructor
    public Dolphin() {
        super("Dolphin"); // Call the parent constructor with "Dolphin"
    }

    // Getters and setters
    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }
    // Implement the eatingCompleted() method from Eat interface
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish");
    }

}
