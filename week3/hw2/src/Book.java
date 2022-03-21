import java.util.Date;

public class Book {
    private String bookName;
    private int pageCount;
    private String authorName;
    private Date publicationDate;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getBookName() {
        return bookName;
    }
}
