package formatation.formater.config.configParser;

import formatation.formater.config.IConfig;
import formatation.reader.IReader;
import formatation.reader.ReaderException;

/**
 * Created by s.krivosheeva on 18.11.2016.
 */
public interface IConfigParser {
    public IConfig createConfig(IReader reader) throws ConfigParserException;
}
