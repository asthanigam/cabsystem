package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Cab;

public class CabDao {
    private static final HashMap<Integer,Cab> cabs = new HashMap<>();
    private static int i = 0;

    public void saveCab(Cab cab) {
       cabs.put(i++, cab);
    }
    
    public List<Cab> getAllCabs()
    {
        return new ArrayList<Cab>(cabs.values());
    }

}
