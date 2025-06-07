package lld_Problems.tomato.strategy;

public class Card_PaymentStrategy implements PaymentStrategy {

    private String cardNumber;

    public Card_PaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using card");

    }
}
