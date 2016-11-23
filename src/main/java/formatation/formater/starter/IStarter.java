package formatation.formater.starter;

import formatation.formater.config.IConfig;
import formatation.reader.IReader;

/**
 * Created by s.krivosheeva on 18.11.2016.
 */
public interface IStarter {
    public IConfig getAvailibleConfig(IReader readerConfig) throws StarterException;

}
