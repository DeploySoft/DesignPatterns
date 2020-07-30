package BehavioralPatterns.Memento;

public class Auth {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public State save() {
        return new State(this.state);
    }

    public void restore(State state) {
        this.state = state.getValue();
    }

    @Override
    public String toString() {
        return "Auth{" +
                "state='" + state + '\'' +
                '}';
    }
}
