package main;

import javax.swing.JFrame;


import view.ConverterFrame;


/**
 * Client class of the program.
 * <br>
 * Invariant: Displays JFrame class ConverterFrame 
 * @author Group 16
 */
public class Main {

	/**
	 * Main method that initiates the client
	 * @param args Console argument
	 * @pre no error exists
	 * @post converter program runs
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JFrame converterFrame = new ConverterFrame();
	}

}
