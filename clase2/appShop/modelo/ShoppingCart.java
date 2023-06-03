import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    private List<Item> items;
    private List<Offer> offers;
    private List<String> senders;
    private PaymentMethod paymentMethod;
    private Scanner scanner;

    public ShoppingCart() {
        items = new ArrayList<>();
        offers = new ArrayList<>();
        senders = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addItem(Item item) {
        items.add(item);
        notifyManager("Nuevo artículo añadido: " + item.getName());
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
        notifyManager("Nueva oferta añadida: " + offer.getName());
    }

    public void addSender(String sender) {
        senders.add(sender);
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        double total = calculateTotal();
        double discount = calculateDiscount();
        double finalAmount = total - discount;
        System.out.println("Monto total: $" + total);
        System.out.println("Descuento: $" + discount);
        System.out.println("Monto final a pagar: $" + finalAmount);
        paymentMethod.pay(finalAmount, TransactionCounter.getNextTransactionId());
        notifyManager("Nueva transacción realizada");
    }

    public void showAvailableItems() {
        System.out.println("Artículos disponibles:");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - $" + item.getPrice());
        }
    }

    public void showAvailableOffers() {
        System.out.println("Ofertas disponibles:");
        for (int i = 0; i < offers.size(); i++) {
            Offer offer = offers.get(i);
            System.out.println((i + 1) + ". " + offer.getName() + " - $" + offer.getPrice());
        }
    }

    public Item selectItem(int itemIndex) {
        if (itemIndex >= 0 && itemIndex < items.size()) {
            return items.get(itemIndex);
        }
        return null;
    }

    public Offer selectOffer(int offerIndex) {
        if (offerIndex >= 0 && offerIndex < offers.size()) {
            return offers.get(offerIndex);
        }
        return null;
    }

    private double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    private double calculateDiscount() {
        if (paymentMethod instanceof CreditCardPayment) {
            double total = calculateTotal();
            return total * 0.1; // 10% de descuento para pago con tarjeta de crédito
        } else if (paymentMethod instanceof PayPalPayment) {
            Item cheapestItem = getCheapestItem();
            return cheapestItem.getPrice(); // El artículo más barato es gratuito para pago con PayPal
        } else if (paymentMethod instanceof CashPayment) {
            Item mostExpensiveItem = getMostExpensiveItem();
            return mostExpensiveItem.getPrice() * 0.9; // 90% de descuento para pago en efectivo
        }
        return 0.0;
    }

    private Item getCheapestItem() {
        return items.stream()
                .min(Comparator.comparing(Item::getPrice))
                .orElse(null);
    }

    private Item getMostExpensiveItem() {
        return items.stream()
                .max(Comparator.comparing(Item::getPrice))
                .orElse(null);
    }

    private void notifyManager(String message) {
        for (String sender : senders) {
            System.out.println("Notificación para el gerente: " + message + " (Remitente: " + sender + ")");
        }
    }
}
