package formatation.formater;

import formatation.writer.IWriter;
import formatation.reader.IReader;

import java.io.IOException;

public interface IFormater {
    public void formate (final IReader reader, final IWriter writer) throws IOException;
}
