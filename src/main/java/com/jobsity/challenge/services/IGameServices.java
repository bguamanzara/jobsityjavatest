package com.jobsity.challenge.services;

import java.util.List;

import com.jobsity.challenge.entity.PersonScore;

public interface IGameServices {

	public boolean getTotalScore(String key, List<String> score);
	public Integer getScore(PersonScore personScore);
	public List<String> getPainfallsFormat(String key, List<PersonScore> peopleMapToList);
}
