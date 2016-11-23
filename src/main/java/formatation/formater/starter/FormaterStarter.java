package formatation.formater.starter;

import formatation.formater.FormaterException;
import formatation.formater.config.IConfig;
import formatation.formater.config.configParser.ConfigParser;
import formatation.formater.config.configParser.IConfigParser;
import formatation.reader.IReader;

/**
 * Created by s.krivosheeva on 18.11.2016.
 */
public class FormaterStarter implements IStarter {
    public FormaterStarter() {
    }

    @Override
    public IConfig getAvailibleConfig(IReader readerConfig) throws FormaterException {
        IConfig config;
        try {
            IConfigParser parser = new ConfigParser();
            config = parser.createConfig(readerConfig);
            /* some enother checks*/
        } catch (StarterException ex) {
            throw new FormaterException("Something wrong", ex);
        }
        return config;
    }

}
