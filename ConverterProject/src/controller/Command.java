package controller;
/**
 * Controller interface. Command interface of Command design pattern. Implemented by ConcreteCommand class SaveCommand.
 * @author Group 16
 *
 */
public interface Command {
	
	/**
	 * Save value to ValueToConvert object and notify all observers(FeetConversionArea, MeterConversionArea).
	 * @param value value to be set
	 * @pre ValueToConvert field is not null
	 * @post ValueToConvert's setValue and notifyObservers methods have been called
	 */
	public abstract void execute(double value);
}
