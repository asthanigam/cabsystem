package models;

public class Cab {
    private String cabNumber;
    private boolean isAvailable;
    private int driverId;
    private int latitude;
    private int longitude;
    public Cab(String cabNumber, int latitude, int longitude)
    {
        this.setAvailable(true);
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public Integer getDriverId() {
        return driverId;
    }
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public String getCabNumber() {
        return cabNumber;
    }
    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }
    public Integer getLatitude() {
        return latitude;
    }
    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }
    public Integer getLongitude() {
        return longitude;
    }
    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }
   
}
