public class Dolphin extends Animal implements Swim {
    private String colorOfDolphin;
    private int swimmingSpeed;
public Dolphin() {
        // Calls the parent class constructor with "Dolphin"
        super("Dolphin");
    }
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
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    // Implement the method from Eat interface
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimmming() {
        System.out.println("Dolphin: I am swimming at the speed of "+swimmingSpeed+" nautical miles per hour");
    }
}
