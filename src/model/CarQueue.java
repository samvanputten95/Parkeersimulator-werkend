package model;
import java.util.LinkedList;
import java.util.Queue;
/*
* Klasse carqueue
* Author: Par-Kings
* Version: 4-2-2017
*/
public class CarQueue {
    private Queue<Car> queue = new LinkedList<>();

    /*
     * voegt auto toe aan queue.
     */
    
    public boolean addCar(Car car) {
        return queue.add(car);
    }
    
    /*
     * methode removeCar, deze haalt auto's weg uit de queue
     */

    public Car removeCar() {
        return queue.poll();
    }

    /*
     * methode carsInQueue, deze haalt queuesize op.
     */
    
    public int carsInQueue(){
    	return queue.size();
    }
}
