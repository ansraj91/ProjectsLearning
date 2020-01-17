package DesignSystem.zoomcar.com.DAO.manage;

import DesignSystem.zoomcar.com.DAO.model.BookingDetail;

import java.util.Date;
import java.util.List;

public class Booking {

    public boolean addBooking(BookingDetail bookingDetail){
        return false;
    }
    public boolean deleteBooking(String bookingID){
        return false;
    }
    public List<BookingDetail> getBookingDetails(String carID){
        return null;
    }
    public BookingDetail getBookingDetail(String carID, Date startTime, Date endTime){
        return null;
    }

    public List<BookingDetail> getBookingDetails(List<String> carIDs, Date startTime, Date endTime){
        return null;
    }


}
