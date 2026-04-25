import java.util.Scanner;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Library {
    private int availableBooks;
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Books remaining: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library(3);
        try {
            System.out.print("Enter number of books to issue (1st time): ");
            int first = sc.nextInt();
            lib.issueBook(first);
            System.out.print("\nEnter number of books to issue (2nd time): ");
            int second = sc.nextInt();
            lib.issueBook(second);
        } 
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        } 
        finally {
            sc.close();
        }
    }
}
