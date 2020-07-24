package CreationalPatterns.Builder;

public class Session {

    private Long id;
    private String user;


    public Session(Long id, String user) {
        this.id = id;
        this.user = user;
    }

    public Session(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static SessionBuilder builder() {
        return new SessionBuilder();
    }


    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", user='" + user + '\'' +
                '}';
    }

    public static class SessionBuilder {

        private Long id;
        private String user;

        SessionBuilder() {
        }


        public SessionBuilder setId(final Long id) {
            this.id = id;
            return this;
        }

        public SessionBuilder setUser(final String user) {
            this.user = user;
            return this;
        }

        public Session build() {
            return new Session(this.id, this.user);
        }
    }

}
