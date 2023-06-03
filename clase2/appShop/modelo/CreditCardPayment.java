public class CreditCardPayment implements PaymentMethod {
    private String name;
    private String creditCardNumber;

    public CreditCardPayment(String name, String creditCardNumber) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount, int transactionId) {
        double discountedAmount = amount * 0.9; // 10% discount for Credit Card payment
        System.out.println("Paying $" + discountedAmount + " by Credit Card");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Card Holder: " + name);
        System.out.println("Card Number: " + creditCardNumber);
    }
}
