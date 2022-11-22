import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class user {
    public String name;
    public LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    public borrow(Book book) {
        this.books.add(book);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now());

        return age.getYears();
    }
}
