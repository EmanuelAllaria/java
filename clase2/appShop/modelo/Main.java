import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        // Agregar algunos artículos
        Item item1 = new Item("Item 1", 70.0);
        Item item2 = new Item("Item 2", 60.0);
        Item item3 = new Item("Item 3", 50.0);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // Mostrar los artículos disponibles
        cart.showAvailableItems();

        // Selección de artículo
        System.out.print("Seleccione un artículo: ");
        int itemIndex = scanner.nextInt();
        scanner.nextLine();
        Item selected = cart.selectItem(itemIndex - 1);
        if (selected != null) {
            System.out.println("Has seleccionado: " + selected.getName());
        } else {
            System.out.println("Selección inválida");
            return;
        }

        // Agregar algunas ofertas
        Offer offer1 = new Offer("Offer 1", 25.0);
        offer1.addItem(item1);
        offer1.addItem(item2);
        Offer offer2 = new Offer("Offer 2", 30.0);
        offer2.addItem(item2);
        offer2.addItem(item3);
        cart.addOffer(offer1);
        cart.addOffer(offer2);

        // Mostrar las ofertas disponibles
        cart.showAvailableOffers();

        // Selección de oferta
        System.out.print("Seleccione una oferta: ");
        int offerIndex = scanner.nextInt();
        scanner.nextLine();
        Offer selectedOffer = cart.selectOffer(offerIndex - 1);
        if (selectedOffer != null) {
            System.out.println("Has seleccionado la oferta: " + selectedOffer.getName());
        } else {
            System.out.println("Selección inválida");
        }

        // Establecer el método de pago
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Efectivo");
        System.out.print("Opción: ");
        int paymentOption = scanner.nextInt();
        scanner.nextLine();

        PaymentMethod paymentMethod;
        switch (paymentOption) {
            case 1:
                System.out.print("Ingrese el nombre del titular de la tarjeta de crédito: ");
                String creditCardHolder = scanner.nextLine();
                System.out.print("Ingrese el número de tarjeta de crédito: ");
                String creditCardNumber = scanner.nextLine();
                paymentMethod = new CreditCardPayment(creditCardHolder, creditCardNumber);
                break;
            case 2:
                System.out.print("Ingrese su dirección de correo electrónico de PayPal: ");
                String email = scanner.nextLine();
                System.out.print("Ingrese su contraseña de PayPal: ");
                String password = scanner.nextLine();
                paymentMethod = new PayPalPayment(email, password);
                break;
            case 3:
                paymentMethod = new CashPayment();
                break;
            default:
                System.out.println("Opción de pago inválida");
                return;
        }

        cart.setPaymentMethod(paymentMethod);

        // Realizar el pago y finalizar la compra
        cart.checkout();

        scanner.close();
    }
}
