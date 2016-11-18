package formatation.formater.config;

import formatation.formater.handler.IHandler;
import formatation.formater.state.IState;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by s.krivosheeva on 18.11.2016.
 */
public interface IConfig {
    public boolean isValidateConfig();
    public Map<Pair<Character, IState>, IHandler> getHandlersMap();
    public Map<Pair<Character, IState>, IState> getStatesMap();
}
