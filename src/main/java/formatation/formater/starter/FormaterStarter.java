package formatation.formater.starter;

import formatation.formater.config.IConfig;

/**
 * Created by s.krivosheeva on 18.11.2016.
 */
public class FormaterStarter implements IStarter {
    public FormaterStarter() {
    }

    @Override
    public boolean checkStartAvailible(IConfig tested) {
        return false;
    }
}
