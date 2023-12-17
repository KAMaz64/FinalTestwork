package Register;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Horse extends PackAnimal {
    public Horse(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("trot", "canter", "gallop", "jump");
    }

    @Override
    public String getAnimalType() {
        return "Horse";
    }
}
