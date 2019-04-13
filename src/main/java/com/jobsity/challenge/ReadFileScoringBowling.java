package com.jobsity.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.jobsity.challenge.entity.PersonScore;
import com.jobsity.challenge.services.IFileServices;
import com.jobsity.challenge.services.IGameServices;
import com.jobsity.challenge.services.impl.FileServicesImpl;
import com.jobsity.challenge.services.impl.GameServicesImpl;

public class ReadFileScoringBowling {

	public static void main(String[] args) {
		try {
			IFileServices fileService = new FileServicesImpl();
			IGameServices gameService = new GameServicesImpl();

			ArrayList<PersonScore> people = new ArrayList<>();
			people = fileService.getPersonScoreListFromTXT();

			Map<String, List<PersonScore>> peopleScore = people.stream()
					.collect(Collectors.groupingBy(PersonScore::getName));

			peopleScore.forEach((key, peopleScoreGroup) -> {
				List<PersonScore> peopleMapToList = peopleScoreGroup;
				List<String> totalScore = new ArrayList<>();
				// format
				totalScore = gameService.getPainfallsFormat(peopleMapToList);
				// create map
				Map<String, List<String>> peopleScoreFormat = new HashMap<>();
				peopleScoreFormat.put(key, totalScore);

				peopleScoreFormat.forEach((k, pinfallsTotal) -> {
					List<String> pinfalls = new ArrayList<>();
					for (int i = 0; i < pinfallsTotal.size() - 1; i++) {
						if (i % 2 == 0) {
							if (gameService.isInteger(pinfallsTotal.get(i))
									&& gameService.isInteger(pinfallsTotal.get(i + 1))) {
								Integer ntotal = gameService.getPinfallNumber(pinfallsTotal.get(i))
										+ gameService.getPinfallNumber(pinfallsTotal.get(i + 1));
								if (ntotal == 10) {
									pinfalls.add(pinfallsTotal.get(i));
									pinfalls.add("/");
								} else {
									pinfalls.add(pinfallsTotal.get(i));
									pinfalls.add(pinfallsTotal.get(i + 1));
								}
							} else {
								pinfalls.add(pinfallsTotal.get(i));
								pinfalls.add(pinfallsTotal.get(i + 1));
							}
						}
					}
					List<String> oldValue = peopleScoreFormat.put(k, pinfalls);
				});
				// change / how n1 + n2 = 10
				System.out.println(peopleScoreFormat);
//				totalScore.forEach(data -> {
//					System.out.println(data);
//				});
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
