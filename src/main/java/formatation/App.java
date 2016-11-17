package formatation;

import formatation.formater.Formater;
import formatation.formater.context.factory.IContextFactory;
import formatation.formater.context.factory.JavaContextFactory;
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

        IContextFactory contextFactory = new JavaContextFactory();
        Formater formater = new Formater(contextFactory);
        FileReader reader = new FileReader("src/main/resources/input.txt");
        FileWriter writer = new FileWriter("src/main/resources/output.txt");

        formater.formate(reader, writer);
    }
}
