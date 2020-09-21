public class IncorrectEntry extends Exception {
    public IncorrectEntry() {
    }

    public IncorrectEntry(String s) {
        super(s);
    }

    public IncorrectEntry(String s, Throwable throwable) {
        super(s, throwable);
    }

    public IncorrectEntry(Throwable throwable) {
        super(throwable);
    }

    public IncorrectEntry(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
