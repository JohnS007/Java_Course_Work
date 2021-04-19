package com.project.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\Users\\Dell\\Downloads\\solution-practice-activities\\solution-practice-activities\\solution-practice-activity-5-di-annotations\\fortune-data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();
	
	@PostConstruct
	public void FileFortuneServiceStartup() {

		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		return theFortunes.get(index);
	}

}
