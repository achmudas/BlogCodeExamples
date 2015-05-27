package co.kurapka.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by achmudas on 27/05/15.
 */
public class ServiceNoBuilderPatternTest {

    private Service service;
    private Person person;

    @Before
    public void setUp() {
        person = createPersonForTesting();
        service = new Service();
    }

    @Test
    public void testPersonIsCapableToBuyDrink() throws Exception {
        Assert.assertTrue(service.isPersonCapableToBuyAlcohol(person));
    }

    @Test
    public void testPersonIsNotCapableToBuyDrink() {
        person.setBirthDate(LocalDate.of(2000, Month.DECEMBER, 24));
        Assert.assertFalse(service.isPersonCapableToBuyAlcohol(person));
    }

    private Person createPersonForTesting() {
        Person person = new Person();
        person.setFirstName("FirstName");
        person.setLastName("LastName");
        person.setAddressOne("AddressOne");
        person.setAddressTwo("AddressTwo");
        person.setBirthDate(LocalDate.of(1995, Month.APRIL, 13));
        person.setDriverLicence(true);
        person.setMarried(true);
        person.setSex("male");
        return person;
    }


}
