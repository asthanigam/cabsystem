package models;

import java.util.List;

import service.CabService;
import service.DriverService;
import service.UserService;

public class Booking {
    private int bookingId;
    private String riderUserId;
    private String driverUserId;
    private String carNumber;
    private String status;
    private List<Driver> drivers;
    private List<User> users;
    private List<Cab> cabs;
    private DriverService driverService = new DriverService();
    private CabService cabService = new CabService();
    private UserService userService = new UserService();
    public Booking()
    {
        this.setDrivers(driverService.getDrivers());
        this.setUsers(userService.getUsers());
        this.setCabs(cabService.getCabs());   
    }
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public String getCarNumber() {
        return carNumber;
    }
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public String getRiderUserId() {
        return riderUserId;
    }
    public void setRiderUserId(String riderUserId) {
        this.riderUserId = riderUserId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<Driver> getDrivers() {
        return drivers;
    }
    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
    public List<Cab> getCabs() {
        return cabs;
    }
    public void setCabs(List<Cab> cabs) {
        this.cabs = cabs;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public String getDriverUserId() {
        return driverUserId;
    }
    public void setDriverUserId(String driverUserId) {
        this.driverUserId = driverUserId;
    }

}
