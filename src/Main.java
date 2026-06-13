
import com.cognizant.exercise2.Product;
import com.cognizant.exercise2.BinarySearch;
import com.cognizant.exercise2.Linearsearch;
import com.cognizant.exercise3.Bubblesort;
import com.cognizant.exercise3.Order;
import com.cognizant.exercise3.Quicksort;
import com.cognizant.exercise4.Employee;
import com.cognizant.exercise5.Task;
import com.cognizant.exercise5.TaskManagementSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TaskManagementSystem tms =
                new TaskManagementSystem();

        tms.addTask(
                new Task(101,
                        "Complete DSA Assignment",
                        "Pending"));

        tms.addTask(
                new Task(102,
                        "Submit Report",
                        "In Progress"));

        tms.addTask(
                new Task(103,
                        "Attend Meeting",
                        "Completed"));

        System.out.println("All Tasks:");

        tms.displayTasks();

        System.out.println("\nSearching Task:");

        System.out.println(
                tms.search(102));

        System.out.println("\nDeleting Task:");

        tms.deleteTask(102);

        System.out.println("\nTasks After Deletion:");

        tms.displayTasks();

    }

}