package formatation.writer;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by Светлана on 20.12.2015.
 */
public class FileWriter implements IWriter {

    private final BufferedWriter bufferedWriter;
    private boolean isStreamClosed = false;

    public FileWriter(final String fileName) throws IOException {
        if (fileName == null) {
            throw new IOException("File name can't be null", new Exception());
        }

        try {
            bufferedWriter = new BufferedWriter(new java.io.FileWriter(fileName));
        } catch (IOException ex) {
            throw new IOException(String.format("File %s can't be created or opened", fileName), ex);
        }
    }

    public void write(final String data) throws IOException {
        if (isStreamClosed) {
            return;
        }

        try {
            bufferedWriter.write(data);
        } catch (IOException ex) {
            throw new IOException("Can't write data", ex);
        }
    }

    public void close() throws IOException {
        try {
            bufferedWriter.close();
        } catch (IOException ex) {
            throw new IOException("Can't close file writer", ex);
        }
        isStreamClosed = true;
    }

}
