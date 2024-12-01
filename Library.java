import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public boolean findItem(T item) {
        return items.contains(item);
    }

    public static void main(String[] args) {
        Library<String> bookLibrary = new Library<>();
        bookLibrary.addItem("Harry Potter");
        bookLibrary.addItem("The Hobbit");
        System.out.println("Book found: " + bookLibrary.findItem("The Hobbit"));

        bookLibrary.removeItem("Harry Potter");
        System.out.println("Book found after removal: " + bookLibrary.findItem("Harry Potter"));

        Library<Integer> dvdLibrary = new Library<>();
        dvdLibrary.addItem(101);
        dvdLibrary.addItem(102);
        System.out.println("DVD found: " + dvdLibrary.findItem(101));
    }
}
