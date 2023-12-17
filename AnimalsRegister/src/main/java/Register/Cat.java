package Register;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Cat extends Pet {
    public Cat(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("meow", "purr", "scratch");
    }

    @Override
    public String getAnimalType() {
        return "Cat";
    }
}
