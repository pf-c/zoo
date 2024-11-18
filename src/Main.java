import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Objects for animals
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        boolean continueProgram = true;

        while (continueProgram) {
            int animalChoice = animalChoiceMenu(keyboard);

            switch (animalChoice) {
                case 1: // Tiger
                    System.out.println("The animal which is chosen is: " + tigerObject.getNameOfAnimal());
                    handleAnimalDetailsMenu(keyboard, tigerObject);
                    break;

                case 2: // Dolphin
                    System.out.println("The animal which is chosen is: " + dolphinObject.getNameOfAnimal());
                    handleAnimalDetailsMenu(keyboard, dolphinObject);
                    break;

                case 3: // Penguin
                    System.out.println("The animal which is chosen is: " + penguinObject.getNameOfAnimal());
                    handlePenguinDetailsMenu(keyboard, penguinObject);
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }

            System.out.println("Do you want to continue? (Enter 1 for yes/ 2 for no):");
            continueProgram = keyboard.nextInt() == 1;
        }

        keyboard.close();
    }

    // Animal choice menu with Penguin added
    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter choice of animal (1-3): ");
        return keyboard.nextInt();
    }

    // Handles animal details menu for Tiger and Dolphin
    private static void handleAnimalDetailsMenu(Scanner keyboard, Animal animal) {
        boolean continueWithAnimal = true;

        while (continueWithAnimal) {
            int menuChoice = animalDetailsManipulationMenu(keyboard, animal);

            switch (menuChoice) {
                case 1: // Set properties
                    if (animal instanceof Tiger tiger) {
                        System.out.println("Enter age of tiger:");
                        tiger.setAge(keyboard.nextInt());
                        System.out.println("Enter height of tiger:");
                        tiger.setHeight((int) keyboard.nextDouble());
                        System.out.println("Enter weight of tiger:");
                        tiger.setWeight((int) keyboard.nextDouble());
                        System.out.println("Enter number of stripes:");
                        tiger.setNumberOfStripes(keyboard.nextInt());

                        System.out.println("Enter speed:");
                        tiger.setSpeed(keyboard.nextDouble());

                        System.out.println("Enter sound level of roar:");
                        tiger.setSoundLevelOfRoar(keyboard.nextInt());
                    } else if (animal instanceof Dolphin dolphin) {
                        System.out.println("Enter color of dolphin:");
                        dolphin.setColorOfDolphin(keyboard.next());
                        System.out.println("Enter age of dolphin:");
                        dolphin.setAge(keyboard.nextInt());
                        System.out.println("Enter height of dolphin:");
                        dolphin.setHeight((int) keyboard.nextDouble());
                        System.out.println("Enter weight of dolphin:");
                        dolphin.setWeight((int) keyboard.nextDouble());
                        System.out.println("Enter swimming speed:");
                        dolphin.setSwimmingSpeed((int) keyboard.nextDouble());
                    }
                    break;

                case 2: // Display properties
                    if (animal instanceof Tiger tiger) {
                        System.out.println("Age: " + tiger.getAge());
                        System.out.println("Height: " + tiger.getHeight());
                        System.out.println("Weight: " + tiger.getWeight());
                        tiger.walking();
                        System.out.println("Number of Stripes: " + tiger.getNumberOfStripes());
                        System.out.println("Sound Level of Roar: " + tiger.getSoundLevelOfRoar());
                    } else if (animal instanceof Dolphin dolphin) {
                        System.out.println("Color of Dolphin: " + dolphin.getColorOfDolphin());
                        System.out.println("Age: " + dolphin.getAge());
                        System.out.println("Height: " + dolphin.getHeight());
                        System.out.println("Weight: " + dolphin.getWeight());
                        dolphin.swimmming();
                    }
                    break;

                case 3: // Display movement
                    if (animal instanceof Tiger) {
                        System.out.println("Tiger is walking...");
                    } else if (animal instanceof Dolphin) {
                        System.out.println("Dolphin is swimming...");
                    }
                    break;

                case 4: // Display eating
                    if (animal instanceof Tiger) {
                        ((Tiger) animal).eatingCompleted();
                    } else if (animal instanceof Dolphin dolphin) {
                        dolphin.eatingFood();
                        dolphin.eatingCompleted();
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
            continueWithAnimal = keyboard.nextInt() == 1;
        }
    }

    // Handles animal details menu specifically for Penguin
    private static void handlePenguinDetailsMenu(Scanner keyboard, Penguin penguin) {
        boolean continueWithPenguin = true;

        while (continueWithPenguin) {
            int menuChoice = animalDetailsManipulationMenu(keyboard, penguin);

            switch (menuChoice) {
                case 1: // Set properties
                    System.out.println("Enter age of penguin:");
                    penguin.setAge(keyboard.nextInt());
                    System.out.println("Enter height of penguin:");
                    penguin.setHeight((int) keyboard.nextDouble());
                    System.out.println("Enter weight of penguin:");
                    penguin.setWeight((int) keyboard.nextDouble());
                    System.out.println("Enter swimming speed:");
                    penguin.setSwimmingSpeed((int) keyboard.nextDouble());
                    System.out.println("Is the dolphin swimming (true/false):");
                    penguin.setSwimming(keyboard.nextBoolean());
                    System.out.println("Enter walking speed:");
                    penguin.setWalkingSpeed((int) keyboard.nextDouble());
                    break;

                case 2: // Display properties
                    System.out.println("Age: " + penguin.getAge());
                    System.out.println("Height: " + penguin.getHeight());
                    System.out.println("Weight: " + penguin.getWeight());
                    System.out.println("Swimming Speed: " + penguin.getSwimmingSpeed());
                    System.out.println("Walking Speed: " + penguin.getWalkingSpeed());
                    break;

                case 3: // Display movement
                    if(penguin.getSwimming()){
                        penguin.swimmming();
                    }else {
                        penguin.walking();
                    }
                    break;

                case 4: // Display eating
                    penguin.eatingFood();
                    penguin.eatingCompleted();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
            continueWithPenguin = keyboard.nextInt() == 1;
        }
    }

    // Animal details manipulation menu
    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.print("Enter choice (1-4): ");
        return keyboard.nextInt();
    }
}
