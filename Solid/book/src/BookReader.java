import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        ReaderBook book = new ReaderBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
