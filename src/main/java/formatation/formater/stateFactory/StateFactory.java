package formatation.formater.stateFactory;

import formatation.formater.state.IState;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public class StateFactory implements IStateFactory {
    Map<Pair<Character, IState>, IState> stateMap;

    public StateFactory(Map<Pair<Character, IState>, IState> initMap) {
        stateMap = initMap;
    }

    @Override
    public IState changeState(char symbol, IState currentState) {
        return stateMap.get(new Pair<Character, IState>(symbol,currentState));
    }
}
