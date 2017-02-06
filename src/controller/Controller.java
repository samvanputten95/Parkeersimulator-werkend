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
		
		if(e.getActionCommand().equals("start")){
			System.out.println("Start has been pressed");
			model.start();
		}
		if(e.getActionCommand().equals("pause")){
			model.pause();
		}
		if(e.getActionCommand().equals("quit")){
			model.pause();
		}
		if(e.getActionCommand().equals("step")){
			model.pause();
		}
	}
	
}
