package formatation.formater.command;

import formatation.formater.handler.IHandler;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public class JavaHandlerFactory implements IHandlerFactory {
    Map<Pair<Character, Integer>, IHandler> commandMap;

    public JavaHandlerFactory(Map<Pair<Character, Integer>, IHandler> initMap) {
        commandMap = initMap;
    }


    @Override
    public IHandler getHandler(char symbol, int state) {
        return commandMap.get(new Pair<Character, Integer>(symbol, state));
    }
}
