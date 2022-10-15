import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        PublisherBook book = new PublisherBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
