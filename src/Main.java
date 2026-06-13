
import com.cognizant.exercise2.Product;
import com.cognizant.exercise2.BinarySearch;
import com.cognizant.exercise2.Linearsearch;
import com.cognizant.exercise3.Bubblesort;
import com.cognizant.exercise3.Order;
import com.cognizant.exercise3.Quicksort;
import com.cognizant.exercise4.Employee;
import com.cognizant.exercise4.EmployeeManagementSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeManagementSystem ems =
                new EmployeeManagementSystem(10);

        ems.addEmployee(
                new Employee(101,
                        "John",
                        "Developer",
                        50000));

        ems.addEmployee(
                new Employee(102,
                        "Alice",
                        "Tester",
                        40000));

        ems.addEmployee(
                new Employee(103,
                        "Bob",
                        "Manager",
                        70000));

        System.out.println("\nAll Employees:");

        ems.displayEmployees();

        System.out.println("\nSearch Employee:");

        Employee employee =
                ems.search(102);

        System.out.println(employee);

        System.out.println("\nDelete Employee:");

        ems.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");

        ems.displayEmployees();
    }



}