package com.aitorgonzalez.advent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aitorgonzalez.advent.day.DayOne;
import com.aitorgonzalez.advent.day.DayThree;
import com.aitorgonzalez.advent.day.DayTwo;

@SpringBootApplication
public class AdventOfCode2020Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AdventOfCode2020Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (args == null || args.length < 4) throw new RuntimeException("Not enough arguments. Valid arguments: Day: 1-30, Part 1-2");
		if (args.length > 4) throw new RuntimeException("Too many arguments. Valid arguments: Day: 1-30, Part 1-2");
		
		Integer day = Integer.parseInt(args[2]);
		Integer part = Integer.parseInt(args[3]);
		
		switch(day) {
			case 1:
				if(part == 1) {
					DayOne.partOne(DayOne.numberList);
				} else if (part == 2) {
					DayOne.partTwo(DayOne.numberList);
				} else {
					throw new RuntimeException("Code for Day "+ day + " and Part " + part + " not found.");
				}
				break;
			case 2:
				if(part == 1) {
					DayTwo.partOne(DayTwo.passwordLines);
				} else if (part == 2) {
					DayTwo.partTwo(DayTwo.passwordLines);
				} else {
					throw new RuntimeException("Code for Day "+ day + " and Part " + part + " not found.");
				}
				break;
			case 3:
				if(part == 1) {
					DayThree.partOne(DayThree.trees, 1, 3);
				} else if (part == 2) {
					DayThree.partTwo(DayThree.trees);
				} else {
					throw new RuntimeException("Code for Day "+ day + " and Part " + part + " not found.");
				}
				break;
			default:
				throw new RuntimeException("Code for Day "+ day + " not found.");
		}
	}

}
