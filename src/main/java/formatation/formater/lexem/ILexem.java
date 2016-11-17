package formatation.formater.lexem;

import formatation.reader.IReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by Светлана on 25.12.2015.
 */
public interface ILexem {
    public List<String> samePartion(String part);
    public Boolean isLexem( String part);
}
