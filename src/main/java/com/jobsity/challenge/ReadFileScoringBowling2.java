package com.jobsity.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.jobsity.challenge.entity.PersonScore;
import com.jobsity.challenge.services.IFileServices;
import com.jobsity.challenge.services.impl.FileServicesImpl;

public class ReadFileScoringBowling2 {
	
	public static void main(String[] args) {

		try {
			ArrayList<PersonScore> people = new ArrayList<>();
			IFileServices fileService  = new FileServicesImpl();
			people = fileService.getPersonScoreListFromTXT();
			
			Map<String, List<PersonScore>> peopleScore = people.stream()
					.collect(Collectors.groupingBy(PersonScore::getName));

			
			peopleScore.forEach((k, v) -> {
				System.out.println((k + ":" + v));
				List<PersonScore> peopleMap = v;
				for(PersonScore data : peopleMap) {
					if(!data.getScore().equals("F")) {
						int n1 = Integer.parseInt(data.getScore());;
						int n2 = Integer.parseInt(data.getScore());
						if((n1 + n2) == 10) {
							System.out.println(true);
						}
						System.out.println(data.getScore());
						n2 = n1;
					}

				}
//				peopless.forEach(data -> {
//					numbers = data.getScore();
//					System.out.println(data.getScore());
//				});
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
