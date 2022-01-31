package view;

import java.awt.Color;
import javax.swing.JTextArea;
/**
 * View class and JTextArea class that accepts input in centimeter
 * <br>
 * Invariant: Text value should be 0 or positive
 * @author Group 16
 */
public class CentimetersConversionArea extends JTextArea {
	
	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = -2565157418554126113L;

	/**
	 * Constructor of CentimetersConversionArea. Sets text to 0 and background to yellow.
	 * @pre this instance has not been set yet
	 * @post the instance has been set
	 */
	public CentimetersConversionArea() {
		this.setText("0");
        this.setBackground(Color.yellow);
        this.setBounds(180,210, 200,200);  
	}
	
	/**
	 * Returns the text value of JTextArea as a double value.
	 * @return the text value of JTextArea as a double value
	 * @pre text value of this instance is not null
	 * @post text value of this instance is returned
	 */
	public double getValue() {
		try {
			return Double.valueOf(this.getText());
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid entry!! Try again");
		}
		return 0;
	}

}
