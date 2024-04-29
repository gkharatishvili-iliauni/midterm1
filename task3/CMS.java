package midterm.giorgi_kharatishvili_4.task3;

import java.util.ArrayList;
import java.util.List;

public class CMS {
    private List<Country> storage = new ArrayList<Country>();

    public void addCountry(Country country) {
        storage.add(country);
    }

    public boolean removeCountry(Country country) {
        boolean removed = false;

        for(int i = 0; i < storage.size(); i++) {
            Country countryToRemove = storage.get(i);
            if (countryToRemove.getName().equals(country.getName()) && countryToRemove.getCapitalCity().equals(country.getCapitalCity())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }

        return removed;
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Country country : storage) {
                System.out.println("Country Name: " + country.getName() + ", Capital City: " + country.getCapitalCity());
                System.out.println();
            }
        }
    }
}