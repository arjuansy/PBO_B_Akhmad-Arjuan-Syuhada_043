package FinalPoject.Action;

import FinalPoject.LibraryObject.Student;
import FinalPoject.LibraryObject.Book;
import FinalPoject.LibraryObject.Library;

public interface LibrarianAction {
        void addBookToLibrary(Library library, Book book);
        Student registerStudent(String name, String cardId, String expiryDate);
}
