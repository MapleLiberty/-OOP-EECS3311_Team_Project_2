package model;

import java.util.ArrayList;
import view.Observer;
/**
 * Model class that saves the input value and notifies other related classes when saved. Singleton Class. ConcreteSubject class of Observer design pattern. Receiver class of Command design pattern.
 * <br>
 * Invariant: value field should be 0 or positive
 * @author 16
 */
public final class ValueToConvert implements Subject {
	
	/**
	 * Singleton ValueToConvert object field
	 */
	private static ValueToConvert uniqueInstance;
	
	/**
	 * input value to be stored
	 */
	private double value;
	
	/**
	 * ArrayList of Observer objects to be notified
	 */
	private ArrayList<Observer> observerCollection;
	
	/**
	 * Constructor of ValueToConvert class
	 * @pre fields have not been initialized yet
	 * @post fields have been initialized
	 */
	private ValueToConvert() {
		this.value = 0;
		this.observerCollection = new ArrayList<Observer>();
	}
	
	/**
	 * Singleton method that returns a unique instance of ValueToConvert
	 * @return singleton object of ValueToConvert object
	 * @pre only one or no ValueToConvert instance exists
	 * @post returns existing or created ValueToCovert instance
	 */
	public static ValueToConvert getInstance() {
		if(uniqueInstance == null)
			uniqueInstance = new ValueToConvert();
		return uniqueInstance;
	}
	
	/**
	 * Sets the input value to be stored.
	 * @param value input value to be stored
	 * @pre the parameter is not null
	 * @post value is set with the parameter
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/**
	 * Returns value stored in ValueToConvert instance.
	 * @return value stored in ValueToConvert instance
	 * @pre value field is initialized
	 * @post value field is returned
	 */
	public double getValue() {
		return this.value;
	}
	
	/**
	 * Adds an Observer object to the arrayList.
	 * @param observer Observer object to be attached.
	 * @pre observerCollection is initialized
	 * @post parameter object has been added to observerCollection
	 */
	@Override
	public synchronized void attach(Observer observer) {
		observerCollection.add(observer);
	}
	
	/**
	 * Removes an Observer object to the arrayList.
	 * @param observer Observer object to be detached.
	 * @pre observerCollection is initialized
	 * @post parameter object has been removed from observerCollection
	 */
	@Override
	public synchronized void detach(Observer observer) {
		observerCollection.remove(observer);
	}
	
	/**
	 * Notify all Observer objects in the arrayList and make them call update method with the value stored in ValueToConvert.
	 * @pre observerCollection's size is more than 0
	 * @post element objects in observerCollection called update method with the value parameter
	 */
	@Override
	public void notifyObservers() {
		for(Observer observer: observerCollection)
			observer.update(this.value);
	}
}
