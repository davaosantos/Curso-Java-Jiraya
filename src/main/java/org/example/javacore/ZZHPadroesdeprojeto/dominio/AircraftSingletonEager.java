package org.example.javacore.ZZHPadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {

    //Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");

    private Set<String> availableSeats = new HashSet<>();

    private AircraftSingletonEager(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    private String aircraftName;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonEager getInstance(){
        return INSTANCE;
    }


    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    public Set<String> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Set<String> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }
}
