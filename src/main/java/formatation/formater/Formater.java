package formatation.formater;

import formatation.formater.command.IHandlerFactory;
import formatation.formater.handler.IHandler;
import formatation.formater.stackInfo.IStackInfo;
import formatation.formater.state.IState;
import formatation.formater.state.State;
import formatation.formater.stateFactory.IStateFactory;
import formatation.reader.IReader;
import formatation.writer.IWriter;

import java.util.Stack;

public class Formater implements IFormater {
    private IStateFactory state;
    private IHandlerFactory command;
    public Formater(IHandlerFactory cmd, IStateFactory state) {
        this.state = state;
        this.command = cmd;
    }

    public void formate(IReader reader, IWriter writer) throws FormaterException { // TODO: posibility setup init nestingLevel
        IState currentState;
        IHandler currentHandler;
        char currentSymbol;
        Stack memory = new Stack();

        currentState = new State();

        while (reader.hasNext()) {
            currentSymbol = reader.read();
            currentHandler = command.getHandler(currentSymbol, currentState); // has default handler
            currentHandler.handle(memory);
            currentState = state.changeState(currentSymbol, currentState);
        }
        writer.close();
    }
}
