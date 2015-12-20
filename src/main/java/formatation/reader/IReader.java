package formatation.reader;

import java.io.IOException;

/**
 * Created by Светлана on 14.12.2015.
 */
public interface IReader {
    public char read() throws IOException;
    public boolean hasNext();
    public void close() throws IOException;
}
