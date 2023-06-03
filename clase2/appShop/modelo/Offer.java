import java.util.ArrayList;
import java.util.List;

public class Offer {
    private String name;
    private double price;
    private List<Item> items;

    public Offer(String name, double price) {
        this.name = name;
        this.price = price;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Item> getItems() {
        return items;
    }
}
