//package com.jobsity.challenge;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//
//import com.jobsity.challenge.services.IGameServices;
//import com.jobsity.challenge.services.impl.GameServicesImpl;
//
//public class ReadFileScoringBowling {
//	
//	public static void main(String[] args) {
//
//		StringBuilder sb = new StringBuilder();
//
//		try (BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/scoringbowling.txt"))) {
//
//			// read line by line
//			String line;
//			while ((line = br.readLine()) != null) {
//				sb.append(line).append("\n");
//			}
//
//		} catch (IOException e) {
//			System.err.format("IOException: %s%n", e);
//		}
//
//		System.out.println(sb);
//
//		try {
//			BufferedReader buf = new BufferedReader(new FileReader("src/main/resources/scoringbowling.txt"));
//			ArrayList<String> words = new ArrayList<>();
//			ArrayList<String> wordstest = new ArrayList<>();
//			String lineJustFetched = null;
//			String[] wordsArray;
//			
//			while (true) {
//				lineJustFetched = buf.readLine();
//				IGameServices service  = new GameServicesImpl();
//				if (lineJustFetched == null) {
//					break;
//				} else {
//					if(!service.verifyLineFrame(lineJustFetched)) {
//						wordsArray = lineJustFetched.split("\t");
//						for (String each : wordsArray) {
//							
////	                        if(!"".equals(each)){
////	                            words.add(each);
////	                        }
//							words.add(each);
//						}
//					}
//				}
//			}
//
//			for (String each : words) {
//				System.out.println(each);
//			}
//
//			buf.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
