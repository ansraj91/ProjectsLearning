package DesignPattern.ChainOfResponsibility.Middleware.Chain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Server {

    Map<String, String> userInfo = new HashMap<String, String>();
    Ab_MiddlewareChainAuth middlewareChainAuth;


    public Server(){

        userInfo = new HashMap <>();

    }

    public void registerUser(String userID,  String role){

        this.userInfo.put(userID, role);
    }

    public boolean isUserExist(String userID){
        return this.userInfo.containsKey(userID);
    }

    public String getUserRole(String userID){
        return this.userInfo.get(userID);
    }

    public void setMiddleWare(Ab_MiddlewareChainAuth middleWare){
        this.middlewareChainAuth = middleWare;
    }

    public boolean login(String userId, String password){
        if(this.middlewareChainAuth.check(userId,password)){
            System.out.println("Server login Sussecess fully!!");
            return true;
        }

        System.out.println("Server Login failed!!");
        return false;
    }



}
