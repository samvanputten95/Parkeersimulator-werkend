package controller;

import java.awt.event.ActionEvent;

import model.Model;

/*
 * klasse controller
 * Author: par-kings
 * version: 4-2-2017
 */

public class Controller extends AbstractController {
	
	
	public Controller(){
		
	}
	
	/**
	 * Constructor for the controller.
	 * @param model the model
	 */
	
	
	public Controller(Model model) {
		setModel(model);		
	}

	@Override
	
	/**
	 * actionhandler. Deze zorgt ervoor dat alle handelingen van de knoppen worden uitgevoerd.
	 */
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//commando start: zorgt dat de simulator begint met runnen.
		if(e.getActionCommand().equals("start")){
			model.start();
		}
		//commando pause: zorgt ervoor dat boolean run wordt ingesteld op false.
		//de simulator kan dan niet runnen.
		if(e.getActionCommand().equals("pause")){
			model.pause();
		}
		//command quit: sluit de simulator.
		if(e.getActionCommand().equals("quit")){
			model.quit();
		}
		//command step: zorgt ervoor dat de simulator met 1 minuut wordt opgeschoven.
		if(e.getActionCommand().equals("step")){
			model.step();
		}
		if(e.getActionCommand().equals("uur")){
			model.uur();
		}
		
	}
	
}
