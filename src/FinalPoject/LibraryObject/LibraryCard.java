package FinalPoject.LibraryObject;

public class LibraryCard {
    private final String cardId;
    private final String expiryDate;

    public LibraryCard(String cardId, String expiryDate) {
        this.cardId = cardId;
        this.expiryDate = expiryDate;
    }

    public String getCardId() {
        return cardId;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
