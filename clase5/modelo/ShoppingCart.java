package clase5.modelo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartAPI {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public void checkout() {
        System.out.println("Realizando el checkout del carrito...");
        // Lógica de checkout
    }
}
