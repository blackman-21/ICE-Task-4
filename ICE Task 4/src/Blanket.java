// Blanket.java
public class Blanket {
    private String size;
    private String color;
    private String material;
    private double price;

    public Blanket() {
        this.size = "Twin";
        this.color = "White";
        this.material = "Cotton";
        this.price = 30.00;
    }

    public void setSize(String size) {
        switch (size) {
            case "Double":
                this.price = 40.00;
                break;
            case "Queen":
                this.price = 55.00;
                break;
            case "King":
                this.price = 70.00;
                break;
            default:
                System.out.println("Invalid size. Setting to default.");
                this.size = "Twin";
                this.price = 30.00;
        }
        this.size = size;
    }

    public void setMaterial(String material) {
        switch (material) {
            case "Wool":
                this.price += 20.00;
                break;
            case "Cashmere":
                this.price += 45.00;
                break;
            default:
                System.out.println("Invalid material. Setting to default.");
                this.material = "Cotton";
                this.price = 30.00;
        }
        this.material = material;
    }

    public String toString() {
        return "Blanket [Size: " + size + ", Color: " + color + ", Material: " + material + ", Price: $" + price + "]";
    }
}
