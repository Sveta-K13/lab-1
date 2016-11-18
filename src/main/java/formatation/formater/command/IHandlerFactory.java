package formatation.formater.command;

import formatation.formater.handler.IHandler;
import formatation.formater.state.IState;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public interface IHandlerFactory {
    public IHandler getHandler(char symbol, IState state);
}
