package edition;

import java.util.Date;

public class CatalogAndEncyclopedia extends Book {
    private Date publicationDate = new Date();
    private String bookName;
    private String author;
    private boolean electronicBook;



    public CatalogAndEncyclopedia() {
        super();
    }

    private CatalogAndEncyclopedia(String bookName, String author, boolean electronicBook, Date publicationDate) {
        super(publicationDate);
        this.bookName = bookName;
        this.author = author;
        this.electronicBook = electronicBook;
    }

    @Override
    public  CatalogAndEncyclopedia publishBook(String bookName, String author, boolean electronicBook) {
        return new CatalogAndEncyclopedia(bookName, author, electronicBook, publicationDate);
    }
    @Override
    public CatalogAndEncyclopedia publishCatalog(String catalogName, String author, boolean electronicBook) {
        return new CatalogAndEncyclopedia(catalogName, author, electronicBook, publicationDate);
    }

    @Override
    public CatalogAndEncyclopedia publishEncyclopedia(String encyclopediaName, String author, boolean electronicBook) {
        return new CatalogAndEncyclopedia(encyclopediaName, author, electronicBook, publicationDate);
    }

    public static void printBook(Book book) {
        System.out.println(book);
    }

    @Override
    public String toString() {
        return "CatalogAndEncyclopedia{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", electronicBook=" + electronicBook +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
