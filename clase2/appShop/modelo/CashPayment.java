public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount, int transactionId) {
        double discountedAmount = amount * 0.1; // 90% discount for Cash payment
        System.out.println("Paying $" + discountedAmount + " in cash");
        System.out.println("Transaction ID: " + transactionId);
    }
}
