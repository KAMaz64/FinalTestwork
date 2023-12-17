package Register;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        AnimalRegistry registry = new AnimalRegistry();

        // Добавление животных в реестр
        registry.addAnimal(new Dog("Bob", "01.01.2019"));
        registry.addAnimal(new Cat("Tom", "01.01.2018"));
        registry.addAnimal(new Hamster("Hammy", "01.01.2022"));
        registry.addAnimal(new Bird("Polly", "01.01.2010"));
        registry.addAnimal(new Horse("Jack", "01.01.2017"));
        registry.addAnimal(new Camel("Sahara", "01.01.2013"));
        registry.addAnimal(new Donkey("Ia", "01.01.2018"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Меню для консольного приложения
            System.out.println("1. Add new animal");
            System.out.println("2. Display commands");
            System.out.println("3. Train animal");
            System.out.println("4. Display animals sorted by date of birth");
            System.out.println("5. Display total count of each animal type");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter animal type (Dog, Cat, Hamster, Bird, Horse, Camel, Donkey): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter date of birth (dd.MM.yyyy): ");
                    String dateOfBirth = scanner.nextLine();

                    Animal newAnimal = createAnimal(type, name, dateOfBirth);
                    if (newAnimal != null) {
                        registry.addAnimal(newAnimal);
                        System.out.println("New animal added successfully.");
                    } else {
                        System.out.println("Invalid animal type.");
                    }
                    break;
                case 2:
                    registry.displayCommands();
                    break;
                case 3:
                    System.out.print("Enter animal name: ");
                    String animalName = scanner.nextLine();
                    System.out.print("Enter command to train: ");
                    String command = scanner.nextLine();
                    registry.trainAnimal(animalName, command);
                    System.out.println("Training complete.");
                    break;
                case 4:
                    registry.displaySortedByDateOfBirth();
                    break;
                case 5:
                    registry.displayTotalCount();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private static Animal createAnimal(String type, String name, String dateOfBirth) throws ParseException {
        switch (type) {
            case "Dog":
                return new Dog(name, dateOfBirth);
            case "Cat":
                return new Cat(name, dateOfBirth);
            case "Hamster":
                return new Hamster(name, dateOfBirth);
            case "Bird":
                return new Bird(name, dateOfBirth);
            case "Horse":
                return new Horse(name, dateOfBirth);
            case "Camel":
                return new Camel(name, dateOfBirth);
            case "Donkey":
                return new Donkey(name, dateOfBirth);
            default:
                return null;
        }
    }
}