package com.jobsity.challenge.services.impl;

import com.jobsity.challenge.services.IGameServices;

public class GameServicesImpl implements IGameServices {

	public boolean verifyLineFrame(String line) {
	       return line.contains("Frame"); 
	}
	
	public boolean addToFinalList(String line) {
	       return line.contains("Frame"); 
	}
}
