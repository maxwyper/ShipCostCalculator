import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the price of the item
        System.out.print("Enter the price of the item: $");
        double price = scanner.nextDouble();

        // Shipping cost variable
        double shippingCost;

        // If the price is $100 or more, shipping is free
        if (price >= 100) {
            shippingCost = 0;
        } else {
            // If not, shipping is 2% of the price
            shippingCost = price * 0.02;
        }

        // total price (price + shipping)
        double totalPrice = price + shippingCost;

        // Output the shipping cost and total price
        System.out.printf("Shipping cost: $" + shippingCost);
        System.out.printf("Total price: $" + totalPrice);
    }
}
