package FormaterTest;

import formatation.formater.Formater;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Светлана
 * Date: 14.12.15
 * Time: 8:17
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    @Test
    public void evaluatesExpression() {
        Formater formater = new Formater();
        String result = formater.formate("{}");
        assertEquals("{}", result);
    }
}
