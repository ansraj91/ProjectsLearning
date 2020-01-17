package DesignPattern.ChainOfResponsibility.Middleware.Client;

import DesignPattern.ChainOfResponsibility.Middleware.Chain.*;

public class App {

    public static void main(String[] args) {
        Server server = new Server();
        server.registerUser("Anshul","admin");
        server.registerUser("Sourav", "user");
        server.registerUser("Amit", "no-access");


        Ab_MiddlewareChainAuth middlewareChainAuth = new ThrotllingMiddleware(2);

        middlewareChainAuth.linkedWith(new AuthenticationMiddleware(server))
                .linkedWith(new AuthorizationMiddleware(server));

        server.setMiddleWare(middlewareChainAuth);
        server.login("Anshul","fhjkdfdsh");


    }

}
