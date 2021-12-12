package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountryTest {
    @Test
    public void should_display_country_details() {
        Country country = new Country("RO", 20000000);

        String greeting = greeter.sayHello();

        assertThat(greeting).isEqualTo("This country has iso code RO and a pupulation of 20000000 people");
    }
}
