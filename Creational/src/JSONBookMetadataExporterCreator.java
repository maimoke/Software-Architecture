public class JSONBookMetadataExporterCreator extends BookMetadataExporter{


    @Override
    public Exporter CreateExporter(){
        return new JSONBookMetadataExporter();
    }
}
