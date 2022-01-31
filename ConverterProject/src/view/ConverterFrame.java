package view;

import javax.swing.JFrame;

import controller.Command;
import controller.ConverterListener;
import controller.SaveCommand;
import model.ValueToConvert;

/**
 * View class of JFrame that incorporates all other GUI components. Client class of Command design pattern.
 * <br>
 * Invariant: Instance should have all other view classes
 * @author Group 16
 *
 */
public class ConverterFrame extends JFrame{
	
	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = -2843287643534185349L;

	
	/**
	 * Constructor of ConverterFrame. Gathers all view components to make GUI
	 * @pre all other view components have no error
	 * @post GUI displayed
	 */
	public ConverterFrame(){
		ValueToConvert valueToConvert = ValueToConvert.getInstance(); 
		Command saveCommand = new SaveCommand();
		
		FeetConversionArea feetConversionArea = new FeetConversionArea(valueToConvert); 
		MeterConversionArea meterConversionArea = new MeterConversionArea(valueToConvert); 
		CentimetersConversionArea centimetersConversionArea = new CentimetersConversionArea();
		
		ConverterPanel converterPanel = new ConverterPanel(feetConversionArea, meterConversionArea, centimetersConversionArea);
		ConverterMenuBar converterMenuBar = new ConverterMenuBar(new ConverterListener(converterPanel, saveCommand));
		
		add(converterPanel);
		setJMenuBar(converterMenuBar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}

}
