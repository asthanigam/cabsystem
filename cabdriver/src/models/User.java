package models;

import java.util.UUID;

public class User {
    private String id;
    private String name;
    private int latitude;
    private int longitude;
    public User(String name, int latitude,int longitude)
    {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLatitude() {
        return latitude;
    }
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    public int getLongitude() {
        return longitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    

}
