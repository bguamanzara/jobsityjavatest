package com.jobsity.challenge.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.jobsity.challenge.entity.PersonScore;
import com.jobsity.challenge.services.IGameServices;

public class GameServicesImpl implements IGameServices {

	public boolean verifyLineFrame(String line) {
	       return line.contains("Frame"); 
	}

	@Override
	public boolean getTotalScore(String key, List<String> score) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer getScore(PersonScore personScore) {
		Integer numberScore;
		if(personScore.getScore().equals("F")) {
			numberScore = null;
		}else {
			numberScore = Integer.parseInt(personScore.getScore());
		}
		return numberScore;
	}

	@Override
	public List<String> getPainfallsFormat(String key, List<PersonScore> peopleMapToList) {
		Integer naux = 0;
		List<String> totalScore = new ArrayList<>();
		totalScore.add(key);
		for (int i = 1; i < peopleMapToList.size() - 1; i++) {

			PersonScore ps1 = peopleMapToList.get(i - 1);
			naux = getScore(ps1);
			if (naux == null) {
				totalScore.add("F");
			}else if(naux == 10){
				totalScore.add("-");
				totalScore.add("X");
			}else {
				totalScore.add(naux.toString());
			}
		}
		return totalScore;
	}
	
}
