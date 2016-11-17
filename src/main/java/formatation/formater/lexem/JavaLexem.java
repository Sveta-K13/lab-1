package formatation.formater.context.lexem;

import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.Collections2;
import formatation.reader.IReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * Created by Светлана on 25.12.2015.
 */
public class StringLexem implements ILexem {
    private List<String> dictionary;
    private IReader reader;

    public StringLexem(String Lexems, char separator) {
        dictionary = Splitter.on(separator).splitToList(Lexems);
    }

    public String readPartion() throws IOException {
        String TextPart = "";
        int likeLexemCount = 0;
        List<String> dictionaryFiltered = new ArrayList(dictionary);
        do {
            TextPart += reader.read();
//             dictionaryFiltered = Collections2.filter(dictionary, new Predicate <String> {
//                @Override
//                public boolean apply(String input) {
//                    return true;
//                }
//            });
            //likeLexemCount = //кол-во элементов массива
        }
        while  ( likeLexemCount > 2 );
        return  TextPart;

    }

    public Boolean isLexem( String part) {
        return true; //part in dictionary   ?
    }

}
