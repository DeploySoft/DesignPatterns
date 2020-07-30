package BehavioralPatterns.Memento;

/**
 * This is Memento
 */
public class State {
    private final String value;

    public State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
