package formatation;

import formatation.formater.Formater;
import formatation.reader.FileReader;
import formatation.writer.FileWriter;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Светлана
 * Date: 14.12.15
 * Time: 1:55
 * To change this template use File | Settings | File Templates.
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.print("Hello, world, yes it`s me");
        Formater formater = new Formater();
        FileReader reader = new FileReader("src/test/resources/input3.txt");
        FileWriter writer = new FileWriter("src/test/resources/output3.txt");
        formater.formate(reader, writer);
    }

}
