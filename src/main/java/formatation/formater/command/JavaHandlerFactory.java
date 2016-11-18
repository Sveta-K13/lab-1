package formatation.formater.command;

import formatation.formater.handler.IHandler;
import formatation.formater.state.IState;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public class JavaHandlerFactory implements IHandlerFactory {
    Map<Pair<Character, IState>, IHandler> commandMap;

    public JavaHandlerFactory(Map<Pair<Character, IState>, IHandler> initMap) {
        commandMap = initMap;
    }


    @Override
    public IHandler getHandler(char symbol, IState state) {
        return commandMap.get(new Pair<Character, IState>(symbol, state));
    }
}
