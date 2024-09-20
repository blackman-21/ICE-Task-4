// IncomingPhoneCall.java
public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.02); // 2 cents per call
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
        System.out.println("Incoming Call - Number: " + getPhoneNumber() + ", Rate: $" + getPrice() + ", Price: $" + getPrice());
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

