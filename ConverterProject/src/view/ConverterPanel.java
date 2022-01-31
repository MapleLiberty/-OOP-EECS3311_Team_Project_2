package view;

import javax.swing.JPanel;
/**
 * View class of JPanel that displays 3 JTextArea of centimeters, feet, and meter.
 * <br>
 * Invariant: Instance should have 3 JTextAreas
 * @author Group 16
 */
public class ConverterPanel extends JPanel {
	
	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = -2841676241527655513L;
	
	/**
	 * JTextArea object that displays value in feet
	 */
	private FeetConversionArea feetConversionArea;
	
	/**
	 * JTextArea object that displays value in meter
	 */
	private MeterConversionArea meterConversionArea;
	
	/**
	 * JTextArea object that displays value in centimeter
	 */
	private CentimetersConversionArea centimetersConversionArea;
	
	/**
	 * Constructor of ConverterPanel
	 * @param feetConversionArea FeetConversionArea object to be added to this instance
	 * @param meterConversionArea MeterConversionArea object to be added to this instance
	 * @param centimetersConversionArea CentimetersConversionArea object to be added to this instance
	 * @pre this instance does not have any JTextArea
	 * @post All 3 JTextArea objects are initiated and added to this instance
	 */
	public ConverterPanel(FeetConversionArea feetConversionArea, MeterConversionArea meterConversionArea, CentimetersConversionArea centimetersConversionArea) {
		super(null);
		
		this.feetConversionArea = feetConversionArea; 
        add(feetConversionArea);  
        
        this.meterConversionArea = meterConversionArea; 
        add(meterConversionArea);  

        this.centimetersConversionArea = centimetersConversionArea;
        add(centimetersConversionArea);  
         
        setLayout(null);  
        setVisible(true); 
	}
	/**
	 * Returns the FeetConversionArea object.
	 * @return the FeetConversionArea object
	 * @pre feetConversionArea is not null
	 * @post feetConversionArea is returned
	 */
	public FeetConversionArea getFeetConversionArea() {
		return feetConversionArea;
	}
	
	/**
	 * Returns the MeterConversionArea object.
	 * @return the MeterConversionArea object
	 * @pre meterConversionArea is not null
	 * @post meterConversionArea is returned
	 */
	public MeterConversionArea getMeterConversionArea() {
		return meterConversionArea;
	}
	
	/**
	 * Returns the CentimetersConversionArea object.
	 * @return the CentimetersConversionArea object
	 * @pre centimetersConversionArea is not null
	 * @post centimetersConversionArea is returned
	 */
	public CentimetersConversionArea getCentimetersConversionArea() {
		return centimetersConversionArea;
	}


}
