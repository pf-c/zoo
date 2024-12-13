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
        System.out.println(getNameOfAnimal() + " is swimming at " + swimmingSpeed + " km/h.");
    }

    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + " is eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + " has finished eating.");
    }

}
