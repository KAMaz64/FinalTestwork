package Register;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Hamster extends Pet {
    public Hamster(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("roll", "spin", "hide");
    }

    @Override
    public String getAnimalType() {
        return "Hamster";
    }
}
