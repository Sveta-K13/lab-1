package formatation.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Светлана on 14.12.2015.
 */
public class FileReader implements IReader {

    private final BufferedReader bufferedReader;
    private Character curCharacter;
//    private Character nextCharacter;
    private boolean isReaderClosed = false;

    public FileReader(final String fileName) throws IOException {
        if (fileName == null) {
            throw new IOException("File name can't be null");
        }

        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(fileName));
        } catch (FileNotFoundException ex) {
            throw new IOException(String.format("File %s can't be opened", fileName), ex);
        }

        curCharacter = readNext();
//        nextCharacter = readNext();
    }


    /**
     * @return
     * @throws IOException
     */
    public char read() throws IOException{
        if (isReaderClosed || !hasNext()) {
            return (char) -1;        // the end of file
        }
        char result = curCharacter;
        curCharacter = readNext();

        return result;
    }

    public boolean hasNext() {
        return curCharacter != null;
    }

    public void close() throws IOException {
        isReaderClosed = true;
        try {
            bufferedReader.close();
        } catch (IOException ex) {
            throw new IOException("Can't close the file reader", ex);
        }
    }

    private Character readNext() throws IOException {
        try {
            int characterCode = bufferedReader.read();
            if (characterCode == -1) {
                return null;
            }
            return (char) characterCode;
        } catch (IOException ex) {
            throw new IOException("Can't read character from file", ex);
        }
    }
}
