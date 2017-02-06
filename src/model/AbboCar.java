package model;

import java.awt.Color;
import java.util.Random;
/*
* Klasse abbocar
* Author: Par-Kings
* Version: 4-2-2017
*/
public class AbboCar extends Car {
	private static final Color COLOR=Color.green;
	/**
	 * constructor voor objecten van klasse AbboCar.
	 */
    public AbboCar() {
    	Random random = new Random();
    	int stayMinutes = (int) (15 + random.nextFloat() * 5 * 60);
        this.setMinutesLeft(stayMinutes);
        this.setHasToPay(false);
    }
    
    /**
     * haalt kleur op voor AbboCar.
     */
    
    public Color getColor(){
    	return COLOR;
    }
}
