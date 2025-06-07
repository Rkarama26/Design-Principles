package lld_Problems.tomato.strategy;

public class Upi_Payment implements PaymentStrategy{

    private String mobile;

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

    public Upi_Payment(String mobile) {
        this.mobile = mobile;
    }
}
