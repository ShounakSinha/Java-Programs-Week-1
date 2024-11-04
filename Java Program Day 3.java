/**

import java.util.*;

public class methodsinjava 
{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Map<String, Integer> prices = new HashMap<>();
    prices.put("Apple", 10);
    prices.put("Banana", 5);
    prices.put("Orange", 8);
    prices.put("Grapes", 15);

    Map<String, Integer> cart = new HashMap<>();

    while (true) {
        System.out.println("Menu:");
        for (String fruit : prices.keySet()) {
            System.out.println(fruit + " - $" + prices.get(fruit));
        }
        System.out.println("Options:");
        System.out.println("1. Add fruit");
        System.out.println("2. Remove fruit");
        System.out.println("3. Increase quantity");
        System.out.println("4. View cart");
        System.out.println("5. Checkout");
        System.out.print("Choose an option: ");

        int option = in.nextInt();
        in.nextLine(); // consume the newline

        if (option == 1) {
            System.out.print("Enter fruit name to add: ");
            String fruit = in.nextLine();
            if (prices.containsKey(fruit)) {
                cart.put(fruit, cart.getOrDefault(fruit, 0) + 1);
                System.out.println(fruit + " added to cart.");
            } else {
                System.out.println("Fruit not available.");
            }
        } else if (option == 2) {
            System.out.print("Enter fruit name to remove: ");
            String fruit = in.nextLine();
            if (cart.containsKey(fruit)) {
                cart.remove(fruit);
                System.out.println(fruit + " removed from cart.");
            } else {
                System.out.println("Fruit not in cart.");
            }
        } else if (option == 3) {
            System.out.print("Enter fruit name to increase quantity: ");
            String fruit = in.nextLine();
            if (cart.containsKey(fruit)) {
                System.out.print("Enter quantity to add: ");
                int qty = in.nextInt();
                in.nextLine(); // consume the newline
                cart.put(fruit, cart.get(fruit) + qty);
                System.out.println("Quantity updated.");
            } else {
                System.out.println("Fruit not in cart.");
            }
        } else if (option == 4) {
            System.out.println("Cart:");
            for (String fruit : cart.keySet()) {
                System.out.println(fruit + " x" + cart.get(fruit));
            }
        } else if (option == 5) {
            double total = 0;
            System.out.println("Bill:");
            for (String fruit : cart.keySet()) {
                int quantity = cart.get(fruit);
                int price = prices.get(fruit);
                double cost = quantity * price;
                System.out.println(fruit + " x" + quantity + " = $" + cost);
                total += cost;
            }
            double discount = 0;
            if (total > 100) {
                discount = total * 0.1;
                System.out.println("Discount: $" + discount);
            }
            total -= discount;
            System.out.println("Total: $" + total);
            break;
        } else {
            System.out.println("Invalid option.");
        }
    }
    in.close();
}
}


*/
