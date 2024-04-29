package midterm.giorgi_kharatishvili_4.task3;

public class CountryTester {
    public static void main(String[] args) {
        Country country1 = new Country("The Netherlands", "Amsterdam");
        country1.setName("Japan");
        country1.setCapitalCity("Tokyo");

        Country country2 = new Country("Georgia", "Tbilisi");
        
        CMS cms = new CMS();

        cms.addCountry(country1);
        cms.addCountry(country2);

        cms.removeCountry(country2);

        cms.printStorage();
    }
}