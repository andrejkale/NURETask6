package edition;

import java.util.Date;

public abstract class Book implements Edition {
    Date publicationDate;
    public Book() {
    }

    public Book(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}
