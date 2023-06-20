import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckoutHandler handler = new CheckoutHandler();
        
                Map<TargetCurrency, Double> exchangeRates1 = new HashMap<>() {{
                        this.put(TargetCurrency.EUR, 0.9);
                        this.put(TargetCurrency.IDR, (double) 1);
                }};

                Map<TargetCurrency, Double> exchangeRates2 = new HashMap<>() {{
                        this.put(TargetCurrency.EUR, 0.9);
                        this.put(TargetCurrency.IDR, (double) 15000);
                }};

                handler.addItemToCart(new Item("Shirt", 25.0));
                handler.addItemToCart(new Item("Pants", 40.0));
                handler.addItemToCart(new Item("Hat", 15.0));
                
                printReceipt(handler);

                // Hitung harga dalam USD
                System.out.println("Total price in USD: $" + String.format("%.2f", handler.totalPriceUSD()));

                // Ubah total harga ke EUR
                double totalPriceEUR = handler.totalPriceUSD() * exchangeRates1.get(TargetCurrency.EUR);
                System.out.println("Total price in EUR: " + String.format("%.2f", totalPriceEUR));

                // Ubah total harga ke IDR
                double totalPriceIDR = handler.totalPriceUSD() * exchangeRates2.get(TargetCurrency.IDR);
                System.out.println("Total price in IDR: Rp " + String.format("%.0f", totalPriceIDR));
                }
                
                public static void printReceipt(CheckoutHandler handler) {
                System.out.println("-------------------");
                System.out.println("      RECEIPT      ");
                System.out.println("-------------------");
                for (Item item : handler.getCart()) {
                        System.out.println(item.getName() + " - $" + item.getPrice());
                }
                System.out.println("-------------------");
        }
}
