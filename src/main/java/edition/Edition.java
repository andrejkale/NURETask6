package edition;

public interface Edition {
    Book publishBook(String bookName, String author, boolean electronicBook);
    Book publishCatalog(String catalogName, String author, boolean electronicBook);
    Book publishEncyclopedia(String encyclopediaName, String author, boolean electronicBook);
}
