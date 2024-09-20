// InternationalDivision.java
public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division - Name: " + divisionName + ", Account Number: " + accountNumber + ", Country: " + country + ", Language: " + language);
    }
}

