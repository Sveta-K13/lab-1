package formatation.formater.lexem;

import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import formatation.reader.IReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * Created by Светлана on 25.12.2015.
 */
public class JavaLexem implements ILexem {
    private List<String> dictionary;

    public JavaLexem(String Lexems, char separator) {
        dictionary = Splitter.on(separator).splitToList(Lexems);
    }
    public JavaLexem() { //default
        dictionary = Splitter.on(',').splitToList("{,},;, ,\t,\n");
    }

    public List<String> samePartion(String part) {
        List<String> filteredList = Lists.newArrayList(Collections2.filter(
                dictionary, Predicates.containsPattern(part)));
        return filteredList;
    }

    public Boolean isLexem( String part) {
        return true; //// TODO:
    }

}
