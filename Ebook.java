public class Ebook extends Book {
    private String format;

    Ebook(int runTime, String title, String author, int pageCount, String format) {
        super(title, author, pageCount);

        this.format = format;
    }
}
