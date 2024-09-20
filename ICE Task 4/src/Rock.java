// Rock.java
public abstract class Rock {
    protected int sampleNumber;
    protected String description;
    protected double weight;

    public Rock(int sampleNumber, double weight) {
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        this.description = "Unclassified";
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }
}
