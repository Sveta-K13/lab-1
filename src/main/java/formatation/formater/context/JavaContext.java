package formatation.formater.context;

import formatation.formater.context.lexem.ILexem;

/**
 * Created by Светлана on 28.12.2015.
 */
public class JavaContext implements IContext {
    private ILexem currentLexem;
    private String formatterString = "";
    private int nestingLevel;

    @Override
    public ILexem getCurrentLexem() {
        return currentLexem;
    };

    @Override
    public String getFormattedString() {
        return formatterString;
    }

    @Override
    public int getNestingLevel() {
        return nestingLevel;
    };

    @Override
    public void setCurrentLexem(ILexem currentLexem) {

    };

    @Override
    public void setFormattedString(String formattedString) {

    };

    @Override
    public void setNestingLevel(int nestingLevel) {

    };
}
