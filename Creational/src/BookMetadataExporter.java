
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;

public abstract class BookMetadataExporter extends BookCollection{

    abstract public Exporter CreateExporter();
    private Exporter Exporter = CreateExporter();
    public void export(PrintStream stream) {
        stream.println(Exporter.getMetadataString());
    }

    @Override
    public void add(Book b) {
        Exporter.append(b);
    }
}
