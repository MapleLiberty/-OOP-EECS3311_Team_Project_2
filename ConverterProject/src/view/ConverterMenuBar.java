package view;

import javax.swing.*;

import controller.ConverterListener;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * View class of JMenuBar that displays a menu option 'Update model'
 * <br>
 * Invariant: Instance should have a JMenu with a JMenuItem and an ActionListener
 * @author Group 16
 */
public class ConverterMenuBar extends JMenuBar {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = -5123349091380723716L;
	/**
	 * ActionListener object to be added
	 */
	private ConverterListener converterListener;
	
	/**
	 * Creates ConverterMenuBar and add the parameter ActionListener to it.
	 * @param converterListener actionListener to be added to the converterMenuBar
	 * @pre this instance does not have any JMenuItem and ActionListner
	 * @post JMenuItem and Action Listener parameter is added to this JMenuBar instance
	 */
	public ConverterMenuBar(ConverterListener converterListener) {
		super();
		this.converterListener = converterListener;
		JMenu converterMenu = new JMenu("Update model");
		converterMenu.add(createMenuItem("Save input centimeters", "SAVE", this.converterListener)); // ALT -> ALT-F
		super.add(converterMenu);
	}

	/**
	 * Returns a menu item created with the parameters.
	 * @param text text of the menu item
	 * @param actionCommand actionCommand of the menu item
	 * @param listener actionListener of the menu item
	 * @return a menu item created with the parameters
	 * @pre Parameters are not null
	 * @post A JMenuItem created with parameters is returned
	 */
	private JMenuItem createMenuItem(String text, String actionCommand, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.ALT_MASK);
		menuItem.setAccelerator(keyStroke);
		return menuItem;
	}

}
