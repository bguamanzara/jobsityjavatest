package com.jobsity.challenge.services;

import java.util.List;

import com.jobsity.challenge.entity.PersonScore;

public interface IGameServices {

	/**
	 * Get People score from txt file;
	 * @return boolean
	 */
	public boolean getTotalPinfalls(String key, List<String> score);
	/**
	 * Get score;
	 * @return Integer
	 */
	public Integer getPinfall(PersonScore personScore);
	/**
	 * Get list from gamers;
	 * @return List<String>
	 */
	public List<String> getPainfallsFormat(List<PersonScore> peopleMapToList);
	/**
	 * 
	 * @param String
	 * @return List<String>
	 */
	public boolean isInteger(String s);
	/**
	 * 
	 * @param string Score
	 * @return Integer
	 */
	public Integer getPinfallNumber(String score);
}
