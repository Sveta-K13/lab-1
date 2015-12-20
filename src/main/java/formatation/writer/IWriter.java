package formatation.writer;

import java.io.IOException;

/**
 * Created by Светлана on 20.12.2015.
 */
public interface IWriter {
    public void write(final String data) throws IOException;
    public void close() throws IOException;
}
