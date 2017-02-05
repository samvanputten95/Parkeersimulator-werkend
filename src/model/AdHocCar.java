package model;

import java.util.Random;
import java.awt.*;
/*
* Klasse AdHocCar
* Author: Par-Kings
* Version: 4-2-2017
*/
public class AdHocCar extends Car {
	private static final Color COLOR=Color.red;
	/*
	 * constructor voor objecten van klasse adhocCar.
	 */
    public AdHocCar() {
    	Random random = new Random();
    	int stayMinutes = (int) (15 + random.nextFloat() * 3 * 60);
        this.setMinutesLeft(stayMinutes);
        this.setHasToPay(true);
    }
    /**
     * methode om kleur op te halen voor adhoc.
     */
    public Color getColor(){
    	return COLOR;
    }
}
