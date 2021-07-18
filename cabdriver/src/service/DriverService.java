package service;

import java.util.List;

import dao.DriverDao;
import models.Driver;

public class DriverService {
    DriverDao driverDao = new DriverDao();
    public void saveDriver(Driver driver) {
        driverDao.saveDriver(driver);    
    }
    public List<Driver> getDrivers()
    {
        return driverDao.getDrivers();
    }

}
