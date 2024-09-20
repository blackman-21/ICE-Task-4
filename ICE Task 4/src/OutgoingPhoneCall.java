// OutgoingPhoneCall.java
public class OutgoingPhoneCall extends PhoneCall {
    private int minutes;
    private final double ratePerMinute = 0.04; // 4 cents per minute

    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        setPrice(ratePerMinute * minutes);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void displayCallInfo() {
        System.out.println("Outgoing Call - Number: " + getPhoneNumber() + ", Rate per minute: $" + ratePerMinute + ", Minutes: " + minutes + ", Total Price: $" + getPrice());
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
