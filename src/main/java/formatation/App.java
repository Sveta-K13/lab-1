package formatation;

import formatation.formater.Formater;
import formatation.formater.FormaterException;
import formatation.formater.command.IHandlerFactory;
import formatation.formater.command.JavaHandlerFactory;
import formatation.formater.config.IConfig;
import formatation.formater.config.configParser.ConfigParser;
import formatation.formater.config.configParser.IConfigParser;
import formatation.formater.starter.IStarter;
import formatation.formater.starter.FormaterStarter;
import formatation.formater.starter.StarterException;
import formatation.formater.stateFactory.IStateFactory;
import formatation.formater.stateFactory.StateFactory;
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
    public static void main(String[] args) throws FormaterException {
        System.out.print("Hello, world, yes it`s me");
        FileReader readerConfig = new FileReader("src/main/resources/config.txt");
        IConfigParser parser = new ConfigParser();
        IStarter starter = new FormaterStarter();
        try {
            IConfig config = parser.createConfig(readerConfig);
            try {
                starter.checkStartAvailible(config);
            }catch (StarterException ex) {
                throw new FormaterException("Can't start, wrong config", ex);
            }

            IHandlerFactory contextFactory = new JavaHandlerFactory(config.getHandlersMap());
            IStateFactory stateFactory = new StateFactory(config.getStatesMap());
            Formater formater = new Formater(contextFactory, stateFactory);
            FileReader reader = new FileReader("src/main/resources/input.txt");
            FileWriter writer = new FileWriter("src/main/resources/output.txt");

            formater.formate(reader, writer);


        } catch (FormaterException ex) {
            throw new FormaterException("Something wrong", ex);
        }

    }
}
