package Register;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Dog extends Pet {
    public Dog(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("sit", "stay", "bark", "down", "fetch");
    }

    @Override
    public String getAnimalType() {
        return "Dog";
    }
}
