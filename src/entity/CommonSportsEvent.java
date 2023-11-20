package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class CommonSportsEvent implements SportsEvent {

    private String organizer;
    private String eventName;
    private LocalDate eventDate;
    private LocalTime eventTime;

    private String eventLocation;

    private int maxAttendance;

    private String lvlOfPlay;

    private String eventDescription;

    private ArrayList<String> attendance;

    public CommonSportsEvent(String organizer, String eventName, LocalDate eventDate, LocalTime eventTime, String eventLocation, int maxAttendance, String lvlOfPlay) {
        this.organizer = organizer;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.maxAttendance = maxAttendance;
        this.lvlOfPlay = lvlOfPlay;
        this.attendance = new ArrayList<>();
        this.eventDescription = "";
    }


    public String lvlofPlay() {
        return lvlOfPlay;
    }

    @Override
    public String getName() {
        return eventName;
    }

    @Override
    public LocalDate getDate() {
        return eventDate;
    }

    @Override
    public LocalTime getTime() {
        return eventTime;
    }

    @Override
    public String getLocation() {
        return eventLocation;
    }

    @Override
    public String getOrganizer() {
        return organizer;
    }

    @Override
    public int getMaxAttendance() {
        return maxAttendance;
    }

    public String getEventDescription(){return eventDescription; }

    public void setEventDescription(String description){
        this.eventDescription = description;
    }

    public ArrayList<String> getAttendance(){return this.attendance;}

    public void addAttendance(String user){this.attendance.add(user);}
}