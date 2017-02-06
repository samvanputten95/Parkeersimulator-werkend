package model;

import java.awt.*;
/*
* Klasse car
* Author: Par-Kings
* Version: 4-2-2017
*/
public abstract class Car {

    private Location location;
    private int minutesLeft;
    private boolean isPaying;
    private boolean hasToPay;

    /**
     * Constructor for objects of class Car
     */
    public Car() {

    }

    /**
     * Methode om locatie op te halen.
     */
    
    public Location getLocation() {
        return location;
    }

    /**
     * methode om locatie voor een bepaalde auto vast te stellen.
     * @param location
     */
    
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * methode om het aantal minuten op te halen dat een auto nog in de parkeergarage mag staan.
     * @return minutesleft
     */
    
    public int getMinutesLeft() {
        return minutesLeft;
    }

    /**
     * Methode om het aantal minuten voor een bepaalde auto vast te stellen.
     * @param minutesLeft
     */
    
    public void setMinutesLeft(int minutesLeft) {
        this.minutesLeft = minutesLeft;
    }
    
    /**
     * deze methode stelt vast of een auto betaalt of niet.
     * @return isPaying
     */
    
    public boolean getIsPaying() {
        return isPaying;
    }
    
    /**
     * deze methode stelt vast dat een bepaalde auto moet betalen.
     * @param isPaying
     */

    public void setIsPaying(boolean isPaying) {
        this.isPaying = isPaying;
    }

    /**
     * deze methode stelt vast of een bepaalde auto moet betalen.
     * @return hasToPay
     */
    
    public boolean getHasToPay() {
        return hasToPay;
    }
    /**
     * Deze methode stelt voor een bepaalde auto vast dat deze moet betalen.
     * @param hasToPay
     */
    public void setHasToPay(boolean hasToPay) {
        this.hasToPay = hasToPay;
    }

    /**
     * tick: deze methode haalt per tick een minuut af van de tijd die een auto mag blijven.
     */
    
    public void tick() {
        minutesLeft--;
    }
    
    
    /*
     * haalt kleur op voor auto.
     */
    public abstract Color getColor();
}