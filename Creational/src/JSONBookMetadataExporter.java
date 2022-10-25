import org.apache.commons.lang3.ObjectUtils.Null;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.IOException;

public class JSONBookMetadataExporter implements Exporter{
    JSONObject obj = new JSONObject();
    private int booknum = 0;

    public JSONBookMetadataExporter(){
        reset();
    }
    @Override
    public JSONBookMetadataExporter reset() {
        obj = new JSONObject();
        booknum = 0;
        JSONObject bobj = new JSONObject();
        bobj.put("ISBN",Book.Metadata.ISBN.toString());
        bobj.put("Title",Book.Metadata.TITLE.toString());
        bobj.put("Publisher",Book.Metadata.PUBLISHER.toString());
        bobj.put("Author",Book.Metadata.AUTHORS.toString());
        obj.put("Book"+booknum++,bobj);
        return this;
    }

    @Override
    public JSONBookMetadataExporter append(Book b) {
            JSONObject bobj = new JSONObject();
            bobj.put("ISBN",b.getISBN());
            bobj.put("Title",b.getTitle());
            bobj.put("Publisher",b.getPublisher());
            JSONArray j = new JSONArray();
            for (String author : b.getAuthors()) {
                j.add(author);
            }
            bobj.put("Author",j);
            obj.put("Book"+booknum++,bobj);
        return this;
    }

    @Override
    public String getMetadataString() {
        return obj.toJSONString();
    }

}
