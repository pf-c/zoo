public class Penguin extends Animal implements Walk, Swim, Eat {
    private boolean isSwimming; // Indicates if the penguin is swimming or walking
    private int walkSpeed; // Speed in walking mode
    private int swimSpeed; // Speed in swimming mode

    // Constructor
    public Penguin() {
        super("Penguin");
    }

    // Getters and Setters
    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    // Override eatingFood method from Eat interface
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    // Implement eatingCompleted method from Eat interface
    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have finished eating fish.");
    }

    // Implement walking method from Walk interface
    @Override
    public void walking() {
        if (!isSwimming) {
            System.out.println("Penguin: I am walking at a speed of " + walkSpeed + " km/h.");
        } else {
            System.out.println("Penguin: I cannot walk while swimming.");
        }
    }

    // Implement swimming method from Swim interface
    @Override
    public void swimming() {
        if (isSwimming) {
            System.out.println("Penguin: I am swimming at a speed of " + swimSpeed + " km/h.");
        } else {
            System.out.println("Penguin: I cannot swim while walking.");
        }
    }
}
