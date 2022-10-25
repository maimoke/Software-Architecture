public class XMLBookMetadataExporterCreator extends BookMetadataExporter{

    @Override
    public Exporter CreateExporter(){
        return new XMLBookMetadataExporter();
    }
}