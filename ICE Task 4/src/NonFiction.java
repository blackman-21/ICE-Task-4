// NonFiction.java
public class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(37.99); // Setting price for non-fiction books
    }
}
