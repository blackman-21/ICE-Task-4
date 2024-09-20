public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setSize(String size) {
        this.size = size;
        if (size.equals("XXL") || size.equals("XXXL")) {
            this.price = 22.99;
        } else {
            this.price = 19.99;
        }
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
