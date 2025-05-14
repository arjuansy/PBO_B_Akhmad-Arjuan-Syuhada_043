package FinalPoject.LibraryObject;

import FinalPoject.Action.LibrarianAction;

public class Librarian extends Person implements LibrarianAction {

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void addBookToLibrary(Library library, Book book) {
        library.addBook(book);
    }

    @Override
    public Student registerStudent (String studentName, String cardId, String expiryDate) {
        LibraryCard card = new LibraryCard(cardId, expiryDate);
        return new Student(studentName, card);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Librarian.");
    }
}
