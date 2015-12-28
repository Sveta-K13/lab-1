package formatation.formater.context;

import formatation.formater.context.lexem.ILexem;

/**
 * Created by Светлана on 25.12.2015.
 */
public interface IContext {
    ILexem getCurrentLexem();   //ILexem
    String getFormattedString();
    int getNestingLevel();

    void setCurrentLexem(ILexem currentCharacter);
    void setFormattedString(String formattedString);
    void setNestingLevel(int nestingLevel);
}
