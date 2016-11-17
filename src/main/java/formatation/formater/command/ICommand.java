package formatation.formater.command;

import formatation.formater.handler.IHandler;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public interface ICommand {
    public IHandler getHandler(char symbol, int state);
}
