public class after{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Product 1", 10);
        Item item2 = new Item("Product 2", 20);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.printItems();
        cart.calculateTotal();
    }
}
