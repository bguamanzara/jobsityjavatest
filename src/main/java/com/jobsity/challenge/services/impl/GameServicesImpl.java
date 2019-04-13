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
	public boolean getTotalPinfalls(String key, List<String> score) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer getPinfall(PersonScore personScore) {
		Integer numberPinfall;
		if(personScore.getScore().equals("F")) {
			numberPinfall = null;
		}else {
			numberPinfall = Integer.parseInt(personScore.getScore());
		}
		return numberPinfall;
	}
	
	@Override
	public List<String> getPainfallsFormat(List<PersonScore> peopleMapToList) {
		Integer naux = 0;
		List<String> totalScore = new ArrayList<>();
		for (int i = 1; i < peopleMapToList.size() - 1; i++) {
			PersonScore ps1 = peopleMapToList.get(i - 1);
			naux = getPinfall(ps1);
			if (naux == null) {
				totalScore.add("F");
			}else if(naux == 10){
				totalScore.add("");
				totalScore.add("X");
			}else {
				totalScore.add(naux.toString());
			}
		}
		return totalScore;
	}
	
	@Override
	public boolean isInteger(String s) {
	    return isInteger(s,10);
	}

	public boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}

	@Override
	public Integer getPinfallNumber(String score) {
		return Integer.parseInt(score);
	}

}
