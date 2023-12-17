package Register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class Animal {
    private String name;
    private Date dateOfBirth;

    public Animal(String name, String dateOfBirth) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        this.dateOfBirth = sdf.parse(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public abstract List<String> getCommands();

    public void train(String command) {
        // Реализация обучения командам
        System.out.println(name + " has learned to " + command);
    }

    public abstract String getAnimalType();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

