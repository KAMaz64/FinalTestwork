package Register;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Bird extends Pet {
    public Bird(String name, String dateOfBirth) throws ParseException {
        super(name, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return Arrays.asList("fly", "sing", "talk");
    }

    @Override
    public String getAnimalType() {
        return "Bird";
    }
}
