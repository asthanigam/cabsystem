package service;

import java.util.List;

import dao.CabDao;
import models.Cab;

public class CabService {
    private CabDao cabDao = new CabDao();
    public void saveCab(Cab cab)
    {
        cabDao.saveCab(cab);
        
    }
    public List<Cab> getCabs()
    {
        return cabDao.getAllCabs();
    }

}
