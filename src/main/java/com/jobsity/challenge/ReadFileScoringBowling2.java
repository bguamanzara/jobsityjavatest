package com.jobsity.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.jobsity.challenge.entity.PersonScore;
import com.jobsity.challenge.services.IFileServices;
import com.jobsity.challenge.services.IGameServices;
import com.jobsity.challenge.services.impl.FileServicesImpl;
import com.jobsity.challenge.services.impl.GameServicesImpl;

public class ReadFileScoringBowling2 {

	public static void main(String[] args) {
		try {
			IFileServices fileService = new FileServicesImpl();
			IGameServices gameService = new GameServicesImpl();

			ArrayList<PersonScore> people = new ArrayList<>();
			people = fileService.getPersonScoreListFromTXT();

			Map<String, List<PersonScore>> peopleScore = people.stream()
					.collect(Collectors.groupingBy(PersonScore::getName));

			peopleScore.forEach((k, v) -> {
				List<PersonScore> peopleMapToList = v;
				List<String> totalScore = new ArrayList<>();
				totalScore = gameService.getPainfallsFormat(k, peopleMapToList);
				totalScore.forEach(data -> {
					System.out.println(data);
				});
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
