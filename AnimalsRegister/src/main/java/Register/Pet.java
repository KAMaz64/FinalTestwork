package Register;

import java.text.ParseException;
import java.util.List;

public class Pet extends Animal {
    public Pet(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return null;
    }

    @Override
    public String getAnimalType() {
        return null;
    }
}
