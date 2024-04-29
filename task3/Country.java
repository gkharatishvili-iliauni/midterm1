package midterm.giorgi_kharatishvili_4.task3;

public class Country {
    private String name, capitalCity;

    public Country(String name, String capitalCity) {
        this.name = name;
        this.capitalCity = capitalCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }
}