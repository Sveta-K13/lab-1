package formatation.formater;

import formatation.formater.context.IContext;
import formatation.formater.context.factory.IContextFactory;
import formatation.reader.IReader;
import formatation.writer.IWriter;

import java.io.IOException;

public class Formater implements IFormater {
    private IContextFactory contextFactory;

    public Formater(final IContextFactory contextFactory) {
        this.contextFactory = contextFactory; //init lang (rules)
    }

    public void formate(IReader reader, IWriter writer) throws IOException { // TODO: posibility setup init nestingLevel
        final IContext context = contextFactory.getContext();
        while (reader.hasNext()) {
            context.setCurrentSymbol(reader.read());
            writer.write(context.getFormattedString());
        }
        writer.write(context.getFormattedString());
        writer.close();
    }
}
