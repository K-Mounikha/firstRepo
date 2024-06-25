package exam;
import java.util.Scanner;
public class Vending_machine {

	public static void main(String[] args) {
	String items[]= {"coke","pepsi","soda"};
	int prices[]= {30,25,20};
	int stock[]= {5,5,5};
	 Scanner scanner = new Scanner(System.in);
     while (true) {
         displayItems(items, prices, stock);
         System.out.print("Select an item (1 for Coke, 2 for Pepsi, 3 for Soda, 0 to exit): ");
         int choice = scanner.nextInt();
         if (choice == 0) {
             System.out.println("Thank you for using the vending machine!!!");
             break;
         }
         if (choice < 1 || choice > items.length) {
             System.out.println("Invalid choice. Please try again.");
             continue;
         }
         int selectedItem = choice - 1;
         if (stock[selectedItem] <= 0) {
             System.out.println("Sorry, " + items[selectedItem] + " is out of stock.");
             continue;
         }
         System.out.print("Insert money (in rupees): ");
         int money = scanner.nextInt();
         
         if (money < prices[selectedItem]) {
             System.out.println("Insufficient money. " + items[selectedItem] + " costs " + prices[selectedItem] + " rupees.");
             continue;
         }
         
         stock[selectedItem]--;
         int change = money - prices[selectedItem];
         System.out.println("Dispensing " + items[selectedItem]);
         if (change > 0) {
             System.out.println("Returning change: " + change + "rupees");
         }
     }
 }
 
 public static void displayItems(String[] items, int[] prices, int[] stock) {
     System.out.println("Available items:");
     for (int i = 0; i < items.length; i++) {
         System.out.println((i + 1) + ". " + items[i] + " - " + prices[i] + " rupees (" + stock[i] + " in stock)");
     }
 }
}
