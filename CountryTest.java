import org.junit.Test;

import static org.junit.Assert.*;

public class CountryTest {
    @Test
    public void should_display_country_details() {
        Country country = new Country("RO", 20000000);

        String countryDetails = country.countryDetails();

        assertEquals("This country has iso code RO and a pupulation of 20000000 people", countryDetails);
    }
}
