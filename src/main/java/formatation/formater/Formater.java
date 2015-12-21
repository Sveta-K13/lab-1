package formatation.formater;

import formatation.formater.waiter.IWaiter;
import formatation.reader.IReader;
import formatation.writer.IWriter;
import java.io.IOException;

public class Formater implements IFormater {

    private IWaiter waiter;// waiter = new ... waiter.on(); ...

    public void setWaiter(){}

//    private final ContextFactory contextFactory;    //has final string
//    private final List<Handler> handlers;
//
//    public JavaCodeFormatter(final List<Handler> handlers, final ContextFactory contextFactory) {
//        this.contextFactory = contextFactory;
//        this.handlers = handlers;
//    }



//    public String formate(String s) {
//        return "{}";
//    }
//    public String formate(IReader reader) throws IOException {
//        return "{}";
//    }
    public void formate(IReader reader, IWriter writer) throws IOException {

//        final Context context = contextFactory.getContext();
//        context.setLastCharacter('\n');
//        context.setNestingLevel(0);
//
//        while (reader.hasNext()) {
//            context.setCurrentCharacter(reader.read());
//
//            for (Handler handler : handlers) {
//                boolean isHandled = handler.handle(context);
//                if (isHandled) {
//                    break;
//                }
//            }
//
//            writer.write(context.getFormattedString());
//
//            context.setLastCharacter(context.getCurrentCharacter());
//            context.setFormattedString("");
//        }

        writer.write("{}");
        writer.close();
    }
}
