package service;

import models.Booking;

public class BookingService {
    private Booking booking;
    private UserService userService = new UserService();
    public BookingService()
    {
        this.booking = new Booking();
    }
    public void startBooking() {
        int i = 0;
        System.out.println("Booking started"+ booking.getCabs().size());
        while(booking.getCabs().size()>0 && booking.getDrivers().size()>0 && booking.getUsers().size()>0)
        {
        if (booking.getCabs().size() == 0 && booking.getUsers().size()>0)
            System.out.println("No cabs available for user"+ booking.getUsers().get(0));
        else
        {
            booking.setBookingId(i++);
            booking.setCarNumber(booking.getCabs().get(0).getCabNumber());
            booking.setRiderUserId(booking.getUsers().get(0).getId());
            booking.setStatus("available"); 
            System.out.println("boooking id "+booking.getBookingId());
            System.out.println("booking user" + userService.getUsers().get(0).getName());
            System.out.println("booking car number"+ booking.getCarNumber());
            System.out.println("cab driver id"+ booking.getDrivers().get(0).getId());
            booking.getCabs().remove(0);
            booking.getUsers().remove(0);
            booking.getDrivers().remove(0);
            
        }
        }
        
       
    }
}
