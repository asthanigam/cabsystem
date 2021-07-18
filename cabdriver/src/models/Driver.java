package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Driver {
    private String id;
    private String name;
    private List<String> bookingHistory;
    public Driver(String name)
    {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.setBookingHistory(new ArrayList<String>());
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
    public List<String> getBookingHistory() {
        return bookingHistory;
    }
    public void setBookingHistory(List<String> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }
}
