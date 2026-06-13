
import com.cognizant.exercise2.Product;
import com.cognizant.exercise2.BinarySearch;
import com.cognizant.exercise2.Linearsearch;
import com.cognizant.exercise3.Bubblesort;
import com.cognizant.exercise3.Order;
import com.cognizant.exercise3.Quicksort;
import com.cognizant.exercise4.Employee;
import com.cognizant.exercise5.Task;
import com.cognizant.exercise6.Book;
import com.cognizant.exercise6.BookBinarySearch;
import com.cognizant.exercise6.BookLinearSearch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Book[] books= {new Book(101, "HarryPotter", "JK Rowling"),
              new Book(102, "Its ends with us", "Hollen coover"),
              new Book(103,"blahblah","Nasima")
          };

      Book search1= BookLinearSearch.search(books,"HarryPotter");
      System.out.println(search1);

      Book search2= BookBinarySearch.search(books,"HarryPotter");
      System.out.println(search2);


    }

}