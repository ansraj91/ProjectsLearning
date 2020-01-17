package DesignSystem.zoomcar.com.DAO.model;

import java.util.Date;

public class BookingDetail {
    String bookingID;
    String carID;
    String userID;
    Date startTime;
    Date endTime;
    String dropLocation;

    public BookingDetail(String bookingID, String carID, String userID, Date startTime, Date endTime, String dropLocation, String pickLocation) {
        this.bookingID = bookingID;
        this.carID = carID;
        this.userID = userID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dropLocation = dropLocation;
        this.pickLocation = pickLocation;
    }



    public String getBookingID() {
        return bookingID;
    }

    public BookingDetail setBookingID(String bookingID) {
        this.bookingID = bookingID;
        return this;
    }

    public String getCarID() {
        return carID;
    }

    public BookingDetail setCarID(String carID) {
        this.carID = carID;
        return this;
    }

    public String getUserID() {
        return userID;
    }

    public BookingDetail setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public BookingDetail setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public BookingDetail setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public BookingDetail setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
        return this;
    }

    public String getPickLocation() {
        return pickLocation;
    }

    public BookingDetail setPickLocation(String pickLocation) {
        this.pickLocation = pickLocation;
        return this;
    }

    String pickLocation;


}
