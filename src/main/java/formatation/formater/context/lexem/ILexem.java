package formatation.formater.context.lexem;

import formatation.reader.IReader;

/**
 * Created by Светлана on 25.12.2015.
 */
public interface ILexem {
    public String readPartion(IReader reader );
    public Boolean isLexem();
}
