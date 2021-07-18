package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Driver;

public class DriverDao {
    private static final HashMap<Integer,Driver> drivers = new HashMap<>();
    private static int i = 0;
    public void saveDriver(Driver driver) {
        drivers.put(i++, driver);
    }
    public List<Driver> getDrivers() {
        return new ArrayList<Driver>(drivers.values());
    }

}
