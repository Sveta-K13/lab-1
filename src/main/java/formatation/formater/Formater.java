package formatation.formater;

import formatation.formater.command.ICommand;
import formatation.formater.handler.IHandler;
import formatation.formater.state.IState;
import formatation.reader.IReader;
import formatation.writer.IWriter;

import java.io.IOException;

public class Formater implements IFormater {
    private IState state;
    private ICommand command;
    public Formater(ICommand cmd, IState state) {
        this.state = state;
        this.command = cmd;
    }

    //todo setters for state, commands
    public void formate(IReader reader, IWriter writer) throws IOException { // TODO: posibility setup init nestingLevel
        int currentState;
        IHandler currentHandler;
        char currentSymbol;
        currentState = state.getInitState();

        while (reader.hasNext()) {
            currentSymbol = reader.read();
            currentHandler = command.getHandler(currentSymbol, currentState);
            currentHandler.handle();
            currentState = state.changeState(currentSymbol, currentState);
        }
        writer.close();
    }
}
