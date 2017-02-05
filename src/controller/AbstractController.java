package controller;
import java.awt.event.ActionListener;

import model.Model;
/*
* Klasse abstractmodel
* Author: Par-Kings
* Version: 4-2-2017
*/
public abstract class AbstractController implements ActionListener{
	protected Model model;
	/**
	 * Methode return model, deze geeft het model weer zoals het nu is.
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * Deze methode stelt het model vast.
	 * @param model
	 */
	public void setModel(Model model) {
		this.model = model;
	}
	
	
}
