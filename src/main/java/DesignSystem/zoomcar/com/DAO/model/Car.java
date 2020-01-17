package DesignSystem.zoomcar.com.DAO.model;

public class Car {

    String carID;
    String carType;
    String carModel;
    String carLicPlate;
    String odoMeter;
    String color;
    String location_div;
    String region;

    public Car(String carID, String carType, String carModel, String carLicPlate, String odoMeter, String color, String location_div, String region) {
        this.carID = carID;
        this.carType = carType;
        this.carModel = carModel;
        this.carLicPlate = carLicPlate;
        this.odoMeter = odoMeter;
        this.color = color;
        this.location_div = location_div;
        this.region = region;
    }



    public String getCarID() {
        return carID;
    }

    public Car setCarID(String carID) {
        this.carID = carID;
        return this;
    }

    public String getCarType() {
        return carType;
    }

    public Car setCarType(String carType) {
        this.carType = carType;
        return this;
    }

    public String getCarModel() {
        return carModel;
    }

    public Car setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public String getCarLicPlate() {
        return carLicPlate;
    }

    public Car setCarLicPlate(String carLicPlate) {
        this.carLicPlate = carLicPlate;
        return this;
    }

    public String getOdoMeter() {
        return odoMeter;
    }

    public Car setOdoMeter(String odoMeter) {
        this.odoMeter = odoMeter;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public String getLocation_div() {
        return location_div;
    }

    public Car setLocation_div(String location_div) {
        this.location_div = location_div;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public Car setRegion(String region) {
        this.region = region;
        return this;
    }



}
