import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
    }

    public void printItems() {
        System.out.println("Items in the cart:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}
