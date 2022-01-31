package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ConverterPanel;

/**
 * Controller class for ConverterMenuBar(View class). Invoker class of Command design pattern.
 * <br>
 * Invariant: converterPanel and saveComamnd fields should be initialized before action event happens
 * @author Group 16
 * 
 */
public class ConverterListener implements ActionListener {
	/**
	 * ConverterPanel object that is final
	 */
	private final ConverterPanel converterPanel;

	/**
	 * ConcreteCommand object to be invoked.
	 */
	private Command saveCommand;
	
	/**
	 * Constructor of ConverterListener
	 * @param converterPanel ConverterPanel object for initializing converterPanel field
	 * @param saveCommand SaveCommand object for initializing saveCommand field
	 * @pre parameters are not null
	 * @post converterPanel and saveCommand fields have been intialized
	 */
	public ConverterListener(ConverterPanel converterPanel, Command saveCommand) {
		this.converterPanel = converterPanel;
		this.saveCommand = saveCommand;
	}

	/**
	 * Manages converter according to the action event. Saves the value at the yellow box at the "SAVE" event.
	 * @param e action event parameter
	 * @pre ActionEvent has occured
	 * @post saveCommand's execute method has been called
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "SAVE":
				double value = converterPanel.getCentimetersConversionArea().getValue();
				saveCommand.execute(value);
				break;
			default:
				throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
	
	/**
	 * Returns the converterPanel field object of the instance
	 * @return the converterPanel field object of the instance
	 * @pre converterPanel field is not null
	 * @post converterPanl field is returned
	 */
	public ConverterPanel getConverterPanel() {
		return this.converterPanel;
	}

}
