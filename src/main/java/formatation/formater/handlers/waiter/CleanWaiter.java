package formatation.formater.handlers.waiter;

public class CleanWaiter implements IWaiter {
    private boolean worked = false;
    private char[] deleteSymbols = null; //what we must remove
    private int countSymbols = 0;

    public boolean isOn() {
        return worked;
    }

    public void on(char[] symbols, int count) { // runtime set clients, not in constructor
        if (isOn()) return;
        this.deleteSymbols  =  symbols;
        this.countSymbols   =  count;
        worked = true;
    }

    public void off() {
        worked = false;
    }

    public boolean compareWithList(char x) {
        int i = 0;
        while (i<countSymbols) {
            if (x == deleteSymbols[i]) return false;// my client
            ++i;
        }
        return true ;
    }

    public String waiting(char x) {
        return "";
    }
}
