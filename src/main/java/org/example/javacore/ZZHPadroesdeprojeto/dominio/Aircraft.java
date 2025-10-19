package org.example.javacore.ZZHPadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {

    private Set<String> availableSeats = new HashSet<>();
    private String aircraftName;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    public Aircraft(String aircraftName) {
        this.aircraftName = aircraftName;
    }
}
