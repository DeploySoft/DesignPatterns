package FactoryMethod;

public class StartClass {


    public static void main(String[] args) {
        IFactoryMethod factoryMethod = new StartClass().createSession("DataBase");
        Session session = factoryMethod.getSession();
        if (factoryMethod instanceof AuthWS) {
            System.out.println("Web service session creating...");
        } else {
            System.out.println("Data base session creating...");
        }

    }

    private IFactoryMethod createSession(String typeSession) {
        if (TypeAuth.DB.getType().equals(typeSession)) {
            return new AuthDB();
        } else if (TypeAuth.WS.getType().equals(typeSession)) {
            return new AuthWS();
        } else {
            return new AuthDB();
        }
    }


}
