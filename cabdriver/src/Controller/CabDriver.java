package Controller;

import java.util.Scanner;

import models.*;
import service.*;
public class CabDriver {
    public static void main(String[] args)
    {
        CabService cabService = new CabService();
        DriverService driverService = new DriverService();
        UserService userService = new UserService();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no. of users");
        int n = ob.nextInt();
        
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter User details- name,latitude and longitude");
            User user = new User(ob.next(),ob.nextInt(),ob.nextInt());
            userService.saveUser(user);
        }
        System.out.println("Enter no. of drivers");
        int m = ob.nextInt();
        
        for(int i = 0;i<m;i++)
        {
            System.out.println("Enter Driver details- name");
            Driver driver = new Driver(ob.next());
            driverService.saveDriver(driver);
        }
        System.out.println("Enter no. of cabs");
        int p = ob.nextInt();
        for(int i = 0;i<p;i++)
        {
            System.out.println("Enter Cab details- carnumber , latitude, longitude ");
            Cab cab = new Cab(ob.next(),ob.nextInt(),ob.nextInt());
            cabService.saveCab(cab);
        }
        BookingService bookingservice = new BookingService();
        bookingservice.startBooking();
    }

}
