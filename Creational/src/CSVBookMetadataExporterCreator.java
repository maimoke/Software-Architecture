public class CSVBookMetadataExporterCreator extends BookMetadataExporter{

    @Override
    public Exporter CreateExporter(){
        return new CSVBookMetadataExporter();
    }
    
}
