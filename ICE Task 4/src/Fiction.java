// Fiction.java
public class Fiction extends Book {

    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(24.99); // Setting price for fiction books
    }
}

