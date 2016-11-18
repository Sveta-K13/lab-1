package formatation.writer;

/**
 * Created by Светлана on 20.12.2015.
 */
public interface IWriter {
    public void write(final String data) throws WriterException;
    public void close() throws WriterException;
}
