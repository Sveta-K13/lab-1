package formatation.formater.state;

import javafx.util.Pair;

import java.util.Map;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public class State implements  IState{
    Map<Pair<Character, Integer>, Integer> stateMap;

    public State(Map<Pair<Character, Integer>, Integer> initMap) {
        stateMap = initMap;
    }

    @Override
    public int getInitState() {
        return 1;
    }

    @Override
    public int changeState(char symbol, int currentState) {
        return stateMap.get(new Pair<Character, Integer>(symbol,currentState));
    }
}
