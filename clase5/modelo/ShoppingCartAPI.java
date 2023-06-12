package clase5.modelo;

import java.util.List;

public interface ShoppingCartAPI {
    void addItem(Item item);
    void removeItem(Item item);
    List<Item> getItems();
    void checkout();
}
