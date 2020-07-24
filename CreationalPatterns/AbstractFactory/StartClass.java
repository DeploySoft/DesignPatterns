package CreationalPatterns.AbstractFactory;

public class StartClass {
    public static void main(String[] args) {
        AuthenticationFactory factory = AuthenticationFactory.getFactory(TypeAuth.WS);
        AuthenticationFactory factoryDB = AuthenticationFactory.getFactory(TypeAuth.DB);
        if (factory instanceof AuthDB) {
            System.out.println("instance of DB");
        }
        if (factory instanceof AuthWS) {
            ((AuthWS) factory).connect();
        }
        Session session = factory.creteSession("User from DB");
        System.out.println(session.toString());
        System.out.println(factoryDB.toString());
    }
}
