package formatation.formater;

import formatation.reader.IReader;
import formatation.writer.IWriter;
import java.io.IOException;

public class Formater {
    public String formate(String s) {
        return "{}";
    }
    public String formate(IReader reader) throws IOException {
        return "{}";
    }
    public void formate(IReader reader, IWriter writer) throws IOException {
        writer.write("{}");
        writer.close();
    }
}
