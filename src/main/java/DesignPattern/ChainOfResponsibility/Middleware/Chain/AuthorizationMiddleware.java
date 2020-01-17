package DesignPattern.ChainOfResponsibility.Middleware.Chain;

public class AuthorizationMiddleware extends Ab_MiddlewareChainAuth {


    private Server server;

    public AuthorizationMiddleware(Server server){
        this.server = server;
    }


    @Override
    public boolean check(String email, String password) {

        if(server.getUserRole(email).equals("admin")){
            System.out.println("Welocome Admin!!");
            return checkNext(email,password);
        }
        if(server.getUserRole(email).equals("user")){
            System.out.println("Welcomme user!!");
            return checkNext(email,password);
        }

        System.out.println("You are not Authorised!!");

        return false;
    }
}
