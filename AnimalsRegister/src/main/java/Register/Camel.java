package Register;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Camel extends PackAnimal {
    public Camel(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("stay", "walk", "carry load", "spit");
    }

    @Override
    public String getAnimalType() {
        return "Camel";
    }
}

