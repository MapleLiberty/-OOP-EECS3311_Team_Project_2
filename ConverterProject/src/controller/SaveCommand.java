package controller;

import model.ValueToConvert;

/**
 * Controller class. ConcreteCommand class of Command design pattern. It is a command object of saving value to ValueToConvert. 
 * <br>
 * Invariant: valueToConvert field should be intialized before calling execute method and execute method parameter value should be 0 or positive.
 * @author Group 16
 */
public class SaveCommand implements Command {
	
	/**
	 * ValueToConvert object that receives the command.
	 */
	private ValueToConvert valueToConvert;
	
	/**
	 * Gets singleton class ValueToConvert object and initialize valueToConvert field.
	 * @pre ValueToConvert field has not been intialized
	 * @post ValueToConvert field has been initialized
	 */
	public SaveCommand() {
		this.valueToConvert = ValueToConvert.getInstance();
	}

	/**
	 * Save value to ValueToConvert object and notify all observers(FeetConversionArea, MeterConversionArea).
	 * @param value value to be set
	 * @pre ValueToConvert filed is not null
	 * @post ValueToConvert's setValue and notifyObservers methods have been called
	 */
	@Override
	public void execute(double value) {
		this.valueToConvert.setValue(value);
		this.valueToConvert.notifyObservers();
	}

}
