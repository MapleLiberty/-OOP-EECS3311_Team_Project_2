package view;

import java.awt.Color;

import javax.swing.JTextArea;

import model.Subject;

/**
 * View class and JTextArea class that shows input value in meter. Observer class of Observer design pattern.
 * <br>
 * Invariant: Text value should be 0 or positive
 * @author Group 16
 */
public class MeterConversionArea extends JTextArea implements Observer {
	
	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = -2088532143842118172L;
	
	/**
	 * Subject object to be attached.
	 */
	Subject subject;
	
	/**
	 * Constructor of MeterConversionArea. Sets text to 0 and background to orange. And attaches itself to parameter Subject object.
	 * @param subject Subject object to be attached
	 * @pre this instance has not been set yet
	 * @post the instance has been set and attached to the subject parameter
	 */
	public MeterConversionArea(Subject subject) {
		this.setText("0 m");
        this.setBackground(Color.orange);
        this.setBounds(285,5,200,200);
        this.subject = subject;
        this.subject.attach(this);
	}
	
	/**
	 * Converts and sets the value to JTextArea.
	 * @param value value to be converted and set
	 * @pre the parameter value is not null
	 * @post text value of this instance has been set with the parameter value
	 */
	public void setValue(double value) {
		this.setText(String.valueOf(value / 100) + " m");
	}
	
	/**
	 * Updates the value with the parameter value
	 * @param value value to be updated
	 * @pre the parameter value is not null
	 * @post setValue method has been called
	 */
	@Override
	public void update(double value) {
		this.setValue(value);
	}

}
