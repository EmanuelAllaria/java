public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount, int transactionId) {
        System.out.println("Paying $0.0 by PayPal"); // Free for PayPal payment
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
