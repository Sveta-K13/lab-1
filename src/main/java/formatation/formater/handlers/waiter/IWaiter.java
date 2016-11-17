package formatation.formater.waiter;

/**
 * Created by Светлана on 21.12.2015.
 */
public interface IWaiter {
    public boolean isOn();
    public void on(char[] symbols, int symCount);
    public void off();

    public boolean compareWithList(char x);
    public String waiting(char x);

}
