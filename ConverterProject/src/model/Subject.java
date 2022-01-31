package model;

import view.Observer;
/**
 * Model interface. Subject interface of Observer design pattern. Implemented by ConcreteSubject class ValueToConvert.
 * @author 16
 *
 */
public interface Subject {
	
	/**
	 * Adds an Observer object to the arrayList.
	 * @param observer Observer object to be attached.
	 * @pre observerCollection is initialized
	 * @post parameter object has been added to observerCollection
	 */
	public abstract void attach(Observer observer);
	
	/**
	 * Removes an Observer object to the arrayList.
	 * @param observer Observer object to be detached.
	 * @pre observerCollection is initialized
	 * @post parameter object has been removed from observerCollection
	 */
	public abstract void detach(Observer observer);
	
	/**
	 * Notify all Observer objects in the arrayList and make them call update method with the value stored in ValueToConvert.
	 * @pre observerCollection's size is more than 0
	 * @post element objects in observerCollection called update method with the value parameter
	 */
	public abstract void notifyObservers();
}
