package DesignPattern.ChainOfResponsibility.Middleware.Chain;

public class ThrotllingMiddleware extends Ab_MiddlewareChainAuth {

    private int allowedRequestPerMin;
    private int requests;
    private long currentTime;

    public ThrotllingMiddleware(int maxReqPerMin){
        this.allowedRequestPerMin = maxReqPerMin;
        this.currentTime = System.currentTimeMillis();
    }





    @Override
    public boolean check(String email, String password) {

        if(System.currentTimeMillis() > (currentTime + 60_000)){
            requests = 0;
            currentTime = System.currentTimeMillis();
        }
        requests++;

        if(requests > this.allowedRequestPerMin){
            System.out.println("Request Limit Exceeded!!");
            Thread.currentThread().interrupt();
        }

        System.out.println("Under Request limit!!");

        return checkNext(email,password);


    }
}
