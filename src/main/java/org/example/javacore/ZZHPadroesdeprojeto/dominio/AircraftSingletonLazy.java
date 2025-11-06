package org.example.javacore.ZZHPadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {

    //Eager initialization
    private static AircraftSingletonLazy INSTANCE;

    private Set<String> availableSeats = new HashSet<>();

    private AircraftSingletonLazy(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    private String aircraftName;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public synchronized static AircraftSingletonLazy getInstance(){
        if (INSTANCE == null){
            synchronized (AircraftSingletonLazy.class){
                if (INSTANCE == null){
                    INSTANCE = new AircraftSingletonLazy("787-800");
                }
            }

        }
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
