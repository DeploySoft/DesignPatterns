package Builder;


public class StartClass {

    public static void main(String[] args) {
        //Creation for default constructor
        Long id = 1L;
        String user = "user";
        Session session = null;

        //Creation for custom constructor
        session = new Session(id, user);

        session.setId(id);
        session.setUser(user);


        //Creation for builder
        Session sessionBuilder;
        sessionBuilder = Session. builder()
                .setId(1L)
                .setUser("user")
                .build();

        System.out.println("Constructor" + session);
        System.out.println("Build" + sessionBuilder);

    }
}
