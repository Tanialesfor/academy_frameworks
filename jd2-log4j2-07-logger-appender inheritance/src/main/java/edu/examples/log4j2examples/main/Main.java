package edu.examples.log4j2examples.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
	
	private final static Logger log = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		log.info("logger test message - info");

	}
}
