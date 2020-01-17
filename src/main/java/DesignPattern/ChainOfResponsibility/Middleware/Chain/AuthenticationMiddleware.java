package DesignPattern.ChainOfResponsibility.Middleware.Chain;

public class AuthenticationMiddleware extends  Ab_MiddlewareChainAuth {

    private Server server;
    public AuthenticationMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {

        if(server.isUserExist(email)){
            System.out.println("Server Authentication Successfull!!");
            return checkNext(email,password);
        }

        System.out.println("Failed Server Authentication!!");

        return false;
    }
}
