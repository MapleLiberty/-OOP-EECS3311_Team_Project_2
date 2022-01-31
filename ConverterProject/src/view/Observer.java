package view;
/**
 * View interface. Observer interface of Observer design pattern. Implemented by ConcreteObserver class FeetConversionArea and MeterConversionArea.
 * @author Group 16
 *
 */
public interface Observer {
	
	/**
     * Updates the value with the parameter value
	 * @param value value to be updated
	 * @pre the parameter value is not null
	 * @post setValue method has been called
	 */
	public abstract void update(double value);
}
