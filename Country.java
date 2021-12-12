public class Country {
    private String isoCode;
    private long population;

    public Country(String isoCode, long population) {
        this.isoCode = isoCode;
        this.population = population;
    }

    public countryDetails() {
        return "This country has iso code " + isoCode + " and a pupulation of " + population + " people";
    }
}