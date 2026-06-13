import com.cognizant.exercise1.InventoryManager;
import com.cognizant.exercise1.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InventoryManager manager=new InventoryManager();
        Product product1=new Product(101,"Laptop",10,50000);
        Product product2=new Product(102,"Mouse",5,350);
        Product product3=new Product(103,"keyboard",15,1000);
        manager.addProduct(product1);
        manager.addProduct(product2);
        manager.addProduct(product3);

        manager.updateProduct(102,10,250);
        manager.deleteProduct(103);
        manager.display();
    }
}