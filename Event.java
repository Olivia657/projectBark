/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalGroup;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Olivia
 */
public class Event {
    public int eventID;
    public String eventName;
    public int maxVolunteers;
    public Date eventDate;
    public Time eventTime;
    public String eventLocation;
    
    // constructor 
    public Event(int eventID, String eventName, int maxVolunteers, Date eventDate, Time eventTime,String eventLocation)
    {
        this.eventID = eventID;
        this.eventName = eventName;
        this.maxVolunteers = maxVolunteers;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        
    }

    public int getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public int getMaxVolunteers() {
        return maxVolunteers;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public Time getEventTime() {
        return eventTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }
    
    
}
