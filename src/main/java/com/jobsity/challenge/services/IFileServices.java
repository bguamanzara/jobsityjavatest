package com.jobsity.challenge.services;

import java.util.ArrayList;

import com.jobsity.challenge.entity.PersonScore;

public interface IFileServices {

	/**
	 * Get People score from txt file;
	 * @return ArrayList<PersonScore>
	 */
	public ArrayList<PersonScore> getPersonScoreListFromTXT();
	/**
	 * Get People score from csv file;
	 * @return ArrayList<PersonScore>
	 */
	public ArrayList<PersonScore> getPersonScoreListFromCSV();
	
}
