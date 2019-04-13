package com.jobsity.challenge;

import java.util.ArrayList;

import org.junit.Test;

import com.jobsity.challenge.entity.PersonScore;
import com.jobsity.challenge.services.IFileServices;
import com.jobsity.challenge.services.impl.FileServicesImpl;

public class TestCharge {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        
    	IFileServices tester = new FileServicesImpl(); 
    	ArrayList<PersonScore> people = new ArrayList<>();
    	people = tester.getPersonScoreListFromTXT();
    }
}
	