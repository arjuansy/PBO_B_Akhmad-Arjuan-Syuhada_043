package FinalPoject.Main;
import FinalPoject.LibraryObject.*;


public class MainSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian =       new Librarian("Mrs. Dewi");
        librarian.displayRole();

        Book book1 = new Book("Java Basics", "John Doe");
        Book book2 = new Book("OOP Advanced", "Jane Smith");

        librarian.addBookToLibrary(library, book1);
        librarian.addBookToLibrary(library, book2);

        Student student = librarian.registerStudent("Ali", "C123", "2026-12-31");
        student.displayRole();

        student.searchBook("Java Basics", library);
        student.borrowBook(book1);
        student.returnBook(book1);
    }
}

