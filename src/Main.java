import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Step 1: Create objects for Tiger, Dolphin, and Penguin
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        boolean continueProgram = true;

        while (continueProgram) {
            // Display main menu and get animal choice
            int animalChoice = animalChoiceMenu(keyboard);

            switch (animalChoice) {
                case 1: // Tiger
                    System.out.println("The animal which is chosen is: " + tigerObject.getNameOfAnimal());
                    handleAnimalMenu(keyboard, tigerObject);
                    break;

                case 2: // Dolphin
                    System.out.println("The animal which is chosen is: " + dolphinObject.getNameOfAnimal());
                    handleAnimalMenu(keyboard, dolphinObject);
                    break;

                case 3: // Penguin
                    System.out.println("The animal which is chosen is: " + penguinObject.getNameOfAnimal());
                    handlePenguinMenu(keyboard, penguinObject);
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }

            System.out.print("Do you want to continue? (Enter 1 for yes / 2 for no): ");
            continueProgram = keyboard.nextInt() == 1;
        }

        keyboard.close();
        System.out.println("Exiting program. Goodbye!");
    }

    // Method to display the main menu
    public static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("\n******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter choice of animal (1-3): ");
        return keyboard.nextInt();
    }

    // Method to display the animal details menu
    public static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("\n******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.print("Enter choice (1-4): ");
        return keyboard.nextInt();
    }

    // Method to handle general animal menu
    public static void handleAnimalMenu(Scanner keyboard, Animal animal) {
        boolean continueWithAnimal = true;

        while (continueWithAnimal) {
            int menuChoice = animalDetailsManipulationMenu(keyboard, animal);

            switch (menuChoice) {
                case 1: // Set properties
                    setAnimalProperties(keyboard, animal);
                    break;

                case 2: // Display properties
                    displayAnimalProperties(animal);
                    break;

                case 3: // Display movement
                    if (animal instanceof Walk) {
                        ((Walk) animal).walking();
                    } else if (animal instanceof Swim) {
                        ((Swim) animal).swimming();
                    } else {
                        System.out.println(animal.getNameOfAnimal() + " has no specific movement behavior.");
                    }
                    break;

                case 4: // Display eating behavior
                    if (animal instanceof Eat) {
                        ((Eat) animal).eatingFood();
                        ((Eat) animal).eatingCompleted();
                    } else {
                        System.out.println(animal.getNameOfAnimal() + " does not have eating functionality.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Continue with this animal? (Enter 1 for yes / 2 for no): ");
            continueWithAnimal = keyboard.nextInt() == 1;
        }
    }

    // Method to handle penguin-specific menu
    public static void handlePenguinMenu(Scanner keyboard, Penguin penguin) {
        boolean continueWithPenguin = true;

        while (continueWithPenguin) {
            System.out.print("Is the penguin swimming or walking? (Enter 1 for swimming / 2 for walking): ");
            boolean isSwimming = keyboard.nextInt() == 1;
            penguin.setIsSwimming(isSwimming);

            int menuChoice = animalDetailsManipulationMenu(keyboard, penguin);

            switch (menuChoice) {
                case 1: // Set properties
                    setAnimalProperties(keyboard, penguin);
                    break;

                case 2: // Display properties
                    displayAnimalProperties(penguin);
                    break;

                case 3: // Display movement
                    if (isSwimming) {
                        penguin.swimming();
                    } else {
                        penguin.walking();
                    }
                    break;

                case 4: // Display eating behavior
                    penguin.eatingFood();
                    penguin.eatingCompleted();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Continue with this penguin? (Enter 1 for yes / 2 for no): ");
            continueWithPenguin = keyboard.nextInt() == 1;
        }
    }

    // Method to set animal properties
    public static void setAnimalProperties(Scanner keyboard, Animal animal) {
        System.out.print("Enter age: ");
        animal.setAge(keyboard.nextInt());

        System.out.print("Enter weight: ");
        animal.setWeight(keyboard.nextInt());

        System.out.print("Enter height: ");
        animal.setHeight(keyboard.nextInt());

        if (animal instanceof Tiger) {
            System.out.print("Enter speed: ");
            ((Tiger) animal).setSpeed(keyboard.nextInt());

            System.out.print("Enter roar level: ");
            ((Tiger) animal).setRoarSoundLevel(keyboard.nextInt());
        } else if (animal instanceof Dolphin) {
            System.out.print("Enter swimming speed: ");
            ((Dolphin) animal).setSwimmingSpeed(keyboard.nextInt());

            System.out.print("Enter color: ");
            keyboard.nextLine(); // Consume newline
            ((Dolphin) animal).setColorOfDolphin(keyboard.nextLine());
        } else if (animal instanceof Penguin) {
            System.out.print("Enter walking speed: ");
            ((Penguin) animal).setWalkSpeed(keyboard.nextInt());

            System.out.print("Enter swimming speed: ");
            ((Penguin) animal).setSwimSpeed(keyboard.nextInt());
        }
    }

    // Method to display animal properties
    public static void displayAnimalProperties(Animal animal) {
        System.out.println("Age: " + animal.getAge());
        System.out.println("Weight: " + animal.getWeight());
        System.out.println("Height: " + animal.getHeight());

        if (animal instanceof Tiger) {
            System.out.println("Speed: " + ((Tiger) animal).getSpeed() + " km/h");
            System.out.println("Roar Level: " + ((Tiger) animal).getRoarSoundLevel());
        } else if (animal instanceof Dolphin) {
            System.out.println("Swimming Speed: " + ((Dolphin) animal).getSwimmingSpeed() + " km/h");
            System.out.println("Color: " + ((Dolphin) animal).getColorOfDolphin());
        } else if (animal instanceof Penguin) {
            System.out.println("Walking Speed: " + ((Penguin) animal).getWalkSpeed() + " km/h");
            System.out.println("Swimming Speed: " + ((Penguin) animal).getSwimSpeed() + " km/h");
        }
    }
}
