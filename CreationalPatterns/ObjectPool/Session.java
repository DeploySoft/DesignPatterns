package CreationalPatterns.ObjectPool;


public class Session {
    private final Long id;
    private boolean active;

    public Session(Long id) {
        this.id = id;
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }
}
