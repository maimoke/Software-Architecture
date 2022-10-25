
public interface Exporter {
    public Exporter reset();
    public Exporter append(Book b);
    public String getMetadataString();
}
