package formatation.formater.state;

/**
 * Created by s.krivosheeva on 17.11.2016.
 */
public interface IState {
    int getInitState();
    int changeState(char symbol, int currentState);
}
