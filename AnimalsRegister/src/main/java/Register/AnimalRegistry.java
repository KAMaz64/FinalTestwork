package Register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AnimalRegistry {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayCommands() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.getCommands());
        }
    }

    public void trainAnimal(String name, String command) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animal.train(command);
                break;
            }
        }
    }

    public void displaySortedByDateOfBirth() {
        List<Animal> sortedAnimals = animals.stream()
                .sorted(Comparator.comparing(Animal::getDateOfBirth))
                .collect(Collectors.toList());

        System.out.println("Sorted list of animals:");

        for (Animal animal : sortedAnimals) {
            System.out.println(
                    "Name: " + animal.getName() +
                            ", Type: " + animal.getAnimalType() +
                            ", Date of Birth: " + new SimpleDateFormat("dd.MM.yyyy").format(animal.getDateOfBirth())
            );
        }
    }

    public void displayTotalCount() {
        Map<String, Integer> countMap = new HashMap<>();
        for (Animal animal : animals) {
            String animalType = animal.getClass().getSimpleName();
            countMap.put(animalType, countMap.getOrDefault(animalType, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

