package DesignPattern.ChainOfResponsibility.Middleware.Chain;

public abstract class Ab_MiddlewareChainAuth {

    private Ab_MiddlewareChainAuth next;

    public Ab_MiddlewareChainAuth linkedWith(Ab_MiddlewareChainAuth middlewareChainInterface){
        this.next = middlewareChainInterface;
        return this.next;
    }


    abstract public boolean check(String email, String password);

    public boolean checkNext(String email, String password){
        if(next == null){
            System.out.println("Successfull!!");
            return true;
        }

        return next.check(email,password);
    }


}
