public class AudioBook extends Book {
    private int runTime;

    AudioBook(int runTime, String title, String author, int runTime) {
        super(title, author, 0);

        this.runTime = runTime;
    }
}
