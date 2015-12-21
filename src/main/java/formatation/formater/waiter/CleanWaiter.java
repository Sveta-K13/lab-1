package formatation.formater.waiter;

public class CleanWaiter implements IWaiter {
    private boolean worked = false;
    private char[] deleteSymbols = null;
    private int countSymbols = 0;

//    public CleanWaiter(char[] symbols, int count) {
//        this.deleteSymbols  =  symbols;
//        this.countSymbols   =  count;
//    }

    public boolean isOn() {
        return worked;
    }

    public void on(char[] symbols, int count) {
        if (isOn()) return;
        this.deleteSymbols  =  symbols;
        this.countSymbols   =  count;
        worked = true;
    }

    public void off() {
        worked = false;
    }

    public boolean isStopWait(char x) {
        int i = 0;
        while (i<countSymbols) {
            if ( deleteSymbols[i] == x) return false;
            ++i;
        }
        return true ;
    }

    public String waiting(char x) {
        return "";
    }
}
