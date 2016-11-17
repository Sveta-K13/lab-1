package formatation.formater.context.lexem;

import formatation.reader.IReader;

import java.io.IOException;

/**
 * Created by Светлана on 25.12.2015.
 */
public interface ILexem {
    public String readPartion() throws IOException;
    public Boolean isLexem( String part);
}
