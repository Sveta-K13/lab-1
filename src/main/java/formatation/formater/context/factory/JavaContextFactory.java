package formatation.formater.context.factory;

import formatation.formater.context.JavaContext;

/**
 * Created by Светлана on 28.12.2015.
 */
public class JavaContextFactory implements IContextFactory {
    public JavaContext getContext() {
        return new JavaContext();
    }
}
