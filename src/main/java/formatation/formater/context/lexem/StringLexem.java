package formatation.formater.context.lexem;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import formatation.reader.IReader;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * Created by Светлана on 25.12.2015.
 */
public class StringLexem implements ILexem {
    List<String> dictionary;
    List<String> even = Collections2.filter(dictionary, new Predicate<String> {
        @Override
        public boolean apply(String input){
            return input % 2 == 0;
        }
    });

    StringLexem(String Lexems) {
        dictionary = newArrayList();
    }


    public String readPartion(IReader reader ) {

    };
    public Boolean isLexem() {

    };
}
