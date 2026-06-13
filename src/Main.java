import com.cognizant.exercise1.InventoryManager;
import com.cognizant.exercise2.Product;
import com.cognizant.exercise2.BinarySearch;
import com.cognizant.exercise2.Linearsearch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Monitor", "Electronics"),
                new Product(104, "Mouse", "Electronics")
        };

        // Linear Search
        Product linearResult =
                Linearsearch.search(products, "Monitor");

        System.out.println("Linear Search Result:");

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        // Binary Search
        Product binaryResult =
                BinarySearch.search(products, "Monitor");

        System.out.println("\nBinary Search Result:");

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }
      }


}