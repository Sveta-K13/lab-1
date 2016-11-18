package formatation.reader;

/**
 * Created by Светлана on 14.12.2015.
 */
public interface IReader {
    public char read() throws ReaderException;
    public boolean hasNext();
    public void close() throws ReaderException;
}
