package com.jobsity.challenge.services.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.jobsity.challenge.entity.PersonScore;
import com.jobsity.challenge.services.IFileServices;

public class FileServicesImpl implements IFileServices {

	public ArrayList<PersonScore> getPersonScoreListFromTXT() {
		ArrayList<PersonScore> people = new ArrayList<>();
		try {
			BufferedReader buf = new BufferedReader(new FileReader("src/main/resources/peoplescoringbowling.txt"));
			String lineJustFetched = null;
			String[] wordsArray;
			PersonScore person = null;
			while (true) {
				lineJustFetched = buf.readLine();
				if (lineJustFetched == null) {
					break;
				} else {
					wordsArray = lineJustFetched.split(" ");
					if (wordsArray.length == 2) {
						if(!wordsArray[1].equals("F")) {
							int validateScore = Integer.parseInt(wordsArray[1]);
							if(validateScore > 10 || validateScore <0) {
								buf.close();
								throw new RuntimeException("One or more scores is incorrect.... please review!!");
							}
						}
						person = new PersonScore(wordsArray[0], wordsArray[1]);
						people.add(person);
					}else {
						buf.close();
						throw new RuntimeException("File structure malformed..... please review!!");
					}
				}
			}
			buf.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return people;
	}
	
	public ArrayList<PersonScore> getPersonScoreListFromCSV() {
		return null;
	}
	
}

