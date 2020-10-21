package CreationalPatterns.AbstractFactory.lambda;

import CreationalPatterns.AbstractFactory.*;

public class StartClassWithLambda {

    public static void main(String[] args) {
        AuthenticationFactory factory = AuthenticationFactoryLambda.getFactory(TypeAuth.WS);
        AuthenticationFactory factoryDB = AuthenticationFactoryLambda.getFactory(TypeAuth.DB);

        System.out.println("1." + factory.fromWhere());
        System.out.println("2." + factoryDB.fromWhere());

    }
}
