package formatation.formater.stateFactory;

import formatation.formater.state.IState;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public interface IStateFactory {
    IState changeState(char symbol, IState currentState);
}
