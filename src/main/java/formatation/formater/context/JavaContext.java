package formatation.formater.context;

import formatation.formater.lexem.ILexem;
import formatation.formater.lexem.JavaLexem;

/**
 * Created by Светлана on 28.12.2015.
 */
public class JavaContext implements IContext {
    private char readedSymbol;
    private String formatterString = "";
    private int nestingLevel = 0;
    private ILexem lexemFinder;

    public JavaContext() {
        lexemFinder = new JavaLexem();
    }

    @Override
    public String getFormattedString() {
        String result = formatterString;
        formatterString = "";
        return result;
    }
    @Override
    public void setCurrentSymbol(char currentSymbol) {
        readedSymbol = currentSymbol;
    };

    public ILexem getLexemFinder(){return lexemFinder;}
    public int getNestingLevel() {
        return nestingLevel;
    };
}
