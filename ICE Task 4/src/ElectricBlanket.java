// ElectricBlanket.java
public class ElectricBlanket extends Blanket {
    private int heatSettings;
    private boolean hasAutoShutoff;

    public ElectricBlanket() {
        super();
        this.heatSettings = 1;
        this.hasAutoShutoff = false;
    }

    public void setHeatSettings(int heatSettings) {
        if (heatSettings < 1 || heatSettings > 5) {
            System.out.println("Invalid heat settings. Setting to default (1).");
            this.heatSettings = 1;
        } else {
            this.heatSettings = heatSettings;
        }
    }

    public void setHasAutoShutoff(boolean hasAutoShutoff) {
        this.hasAutoShutoff = hasAutoShutoff;
        if (hasAutoShutoff) {
            super.setMaterial("Wool"); // Adding premium price for automatic shutoff
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Heat Settings: " + heatSettings + ", Auto Shutoff: " + (hasAutoShutoff ? "Yes" : "No");
    }
}
