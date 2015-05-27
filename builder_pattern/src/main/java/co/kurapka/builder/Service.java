package co.kurapka.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by achmudas on 27/05/15.
 */
public class Service {

    public boolean isPersonCapableToBuyAlcohol(Person person) {

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(person.getBirthDate(), currentDate);

        if (period.getYears() >= 18) {
            return true;
        }
        return false;
    }
}
