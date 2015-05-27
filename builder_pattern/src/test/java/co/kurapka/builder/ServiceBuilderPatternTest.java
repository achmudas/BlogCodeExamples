package co.kurapka.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 * Created by achmudas on 27/05/15.
 */
public class ServiceBuilderPatternTest {

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
        return Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("AddressOne")
                .addressTwo("AddressTwo")
                .birthDate(LocalDate.of(1995, Month.APRIL, 13))
                .sex("male")
                .driverLicence(true)
                .married(true)
                .build();
    }
}
