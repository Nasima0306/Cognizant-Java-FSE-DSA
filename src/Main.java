import com.cognizant.exercise1.InventoryManager;
import com.cognizant.exercise2.Product;
import com.cognizant.exercise2.BinarySearch;
import com.cognizant.exercise2.Linearsearch;
import com.cognizant.exercise3.Bubblesort;
import com.cognizant.exercise3.Order;
import com.cognizant.exercise3.Quicksort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "John", 4500),
                new Order(102, "Alice", 2000),
                new Order(103, "Bob", 7000),
                new Order(104, "David", 3000)
        };

        Order[] orders2 = {
                new Order(101, "John", 4500),
                new Order(102, "Alice", 2000),
                new Order(103, "Bob", 7000),
                new Order(104, "David", 3000)
        };

        System.out.println("Before Bubble Sort");

        for (Order order : orders1) {
            System.out.println(order);
        }

        Bubblesort.sort(orders1);

        System.out.println("\nAfter Bubble Sort");

        for (Order order : orders1) {
            System.out.println(order);
        }

        System.out.println("\nBefore Quick Sort");

        for (Order order : orders2) {
            System.out.println(order);
        }

        Quicksort.sort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort");

        for (Order order : orders2) {
            System.out.println(order);
        }
      }


}