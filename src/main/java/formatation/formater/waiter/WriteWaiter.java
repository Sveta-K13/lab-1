package formatation.formater.waiter;

public class WriteWaiter {
    private boolean worked = false;
    private char[] waitSymbols = null;
    private int countSymbols = 0;

//    public WriteWaiter(char[] symbols, int count) {
//        this.waitSymbols  =  symbols;
//        this.countSymbols   =  count;
//    }

    public boolean isOn() {
        return worked;
    }

    public void on(char[] symbols, int count) {
        if (isOn()) return;
        this.waitSymbols  =  symbols;
        this.countSymbols   =  count;
        worked = true;
    }

    public void off() {
        worked = false;
    }

    protected boolean isStopWait(char x) {
        int i = 0;
        while (i<countSymbols) {
            if ( waitSymbols[i] == x) return true;
            ++i;
        }
        return false;
    }

    protected String waiting(char x) {
        return String.valueOf(x);
    }
}
