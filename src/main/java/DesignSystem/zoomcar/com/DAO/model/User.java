package DesignSystem.zoomcar.com.DAO.model;

public class User {


    String userID;
    String userName;
    String licenseDetail;
    String userLocation;

    public User(String userID, String userName, String licenseDetail, String userLocation) {
        this.userID = userID;
        this.userName = userName;
        this.licenseDetail = licenseDetail;
        this.userLocation = userLocation;
    }


    public String getUserID() {
        return userID;
    }

    public User setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getLicenseDetail() {
        return licenseDetail;
    }

    public User setLicenseDetail(String licenseDetail) {
        this.licenseDetail = licenseDetail;
        return this;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public User setUserLocation(String userLocation) {
        this.userLocation = userLocation;
        return this;
    }



}
