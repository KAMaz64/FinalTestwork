package Register;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Donkey extends PackAnimal {
    public Donkey(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("walk", "bray", "kick");
    }

    @Override
    public String getAnimalType() {
        return "Donkey";
    }
}
