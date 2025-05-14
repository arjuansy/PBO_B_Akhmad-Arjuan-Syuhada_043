package FinalPoject.LibraryObject;

import FinalPoject.Action.StudentAction;
import java.util.ArrayList;


public class Student extends Person implements StudentAction {
    private final LibraryCard card;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student(String name, LibraryCard card) {
        super(name);
        this.card = card;
    }

    public void searchBook(String title, Library library) {
        Book book = library.findBookByTitle(title);
        System.out.println(book != null ? "Found: " + book.getTitle() : "Book not found.");
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedBooks.add(book);
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("You haven't borrowed this book.");
        }
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Student.");
    }
}

