package com.aitorgonzalez.advent.day;

import java.util.Arrays;
import java.util.List;

public class DayThree {
	public static List<String> trees = Arrays.asList("..#...##...###.........#..#..#.",
			"#.###........#..##.#......#...#", "#.#.###..#.#..#.#............#.", ".##............#......#...#.#..",
			"..#..#.....##..##..##..........", "...#...........###.#.##........", "....#.#...#..#..##............#",
			"....#....##...##..##........#..", ".#..#..#....#...#..##.....##...", ".#.###..#......####........##..",
			"..#...###....#......#.....##.##", "..#...#.......#......#..##....#", "#...##....#.#..#.......#....#..",
			".#......#..#...........#....##.", ".##.#......#.#.#.....##........", ".....#.................#.#..#.#",
			"....#..#........##......#..#.#.", "..#...#..##.......#..##...#..#.", "..#.......#.............#.#....",
			".#.................#.........#.", "..#..#.#.#.#............##.#..#", ".#.#.##.#.....#.....#..#......#",
			"..#.#..#.#..........##........#", ".........#...#.....#.#...#####.", "##..#.....##.##........#...##..",
			".#.....#....##.#..#....##...##.", ".##.....#.#....#.#.....#......#", ".....#..#.##.....#.#....#.#..##",
			"#......##..##....##...###..#...", ".......#..#...........#......#.", "#...#......#........#..#.......",
			"##..#.....##.....#...#...#....#", ".###..##..#.#........#..#.#....", "#.#...#...#......##........#.#.",
			"......#....#.#........##...#..#", ".#.....#..#.#.....#......##....", ".....#.....#.#.#....###.....#..",
			"#.......##.#......#.#.#....###.", ".......#..#..#...#.#.##........", ".#......##..#.........###..#...",
			"....#..##.......##.###...###...", ".##............#..#.##.....#.##", "..##.#.......##....#.......##.#",
			"#..###............#.#...#...#.#", "...##.#.#.#..#.##........#.#...", ".#.....#...##.#..###..##.##...#",
			"..............#.#.#.........#..", ".....#...........#.#...#....#..", ".....#...##.##.#....#.###..#...",
			"#..###.........#......#.#.#....", ".....#..#...##...###.#....#....", "#..........#.#.#....#..#......#",
			"###...................#......#.", "........####......#.#..........", ".......#.....#...#.......#...#.",
			".....#.....................#...", "...#.#...#...#...........#.....", "..#.........#...#....###..#....",
			".....#.#..##......##........##.", "..#.............#............#.", ".#....##.......#..#............",
			".#............#.#..#.##....#...", ".####...##.#....#.....#...#....", "##..#....#.#.#...........#..#.#",
			"...#..#...........#...#..#....#", ".....##.....#..#...#.........#.", "...##........#....##........#..",
			".##.#...#...#..#.....#....##.#.", "#.#...#.#.#.#.#..#....#....#...", "#..#.#...#..#........#....#.#..",
			"....#.#.....#......##...#....#.", ".###.##...#....##.#...###..#..#", "###..#...##..#......#.........#",
			"..#.#......##.......#.....#...#", "..#...#........#.........#.#...", "#....#..#.........###.#......##",
			"...#..#....#...#.......##.#.#..", "....#.......#....###...##.#....", "..#.....#.#.....###..#####....#",
			"##......#....#.....##..#..#...#", "#...........#..#..#....#....#..", ".#...#.##.#.#.#....#......#..#.",
			".......#.#....#....#...#.#..#..", "..#.#..#.##..##...##..#..#.....", "...##.##.................#.#...",
			".....#...#......##.#....#.....#", "......#..##.#..#.#.........#...", ".............##.#......#.......",
			"..#.#.....#...#.#.....#..#.....", ".........#..#.#......#..#......", "#..#.#.##..........#.##......##",
			"......#.......#.....#..#.#...#.", ".#....#....#.#.....#.......#...", "#..#..##..................#....",
			"............#...........##.#...", "####...#..##.#....#.##..#......", "#...#...#.....#.#...#.#........",
			".......##.........#.....#.....#", ".....#...........##......#.####", ".##....#.#.##......###.#.##....",
			"........#.####.......#.#...#...", ".#.#...##.#.#.#.........##.....", "....#............###.##....#...",
			"...##........##.#...#....#..###", "..#.#.........#....##.#........", "..#..##..#...##..#.##...#.....#",
			".#......#..#..#.........#......", "..#........##.#......#.....#...", ".##.......#....#.#......#......",
			"#........#....#.####...#.#.....", "##......#.............#....###.", "..#....####.#.#.#.#...##......#",
			"#.#.#.....#...#.......#...##...", "........#...#....#..#......#.#.", "#..#...#.#.##.....#.#....#....#",
			"#...#....#......#.........##.##", "..##.#..##............#........", "#.........####.........#.......",
			"#.##.........#..##....#.#.#.#..", ".###......##..#.#.....#.#...##.", "...#.........#.#...##.##....#..",
			"#..#......#....##..#.#...#...##", "...#.......#.#.#.....#..##...#.", "....................###........",
			"#...........###......#.#...##.#", ".................#.#...###....#", "...#..###..#.##...#..#....##...",
			"###..#..#.#...#.....#.#.......#", ".........#..#.#.....#.........#", ".##..#.........#.#.....##......",
			".....#..........#.#.##....#....", "........#.##.....#...##...#....", "#.#.#...#......##....#.###.....",
			".#.##.....##.....#....#.##.#.##", ".#...#.....##.#.##....#.....#.#", "...#.....#........#............",
			"##...####..#....#..##...#......", "#.......#...#.#...#........#..#", "......#.....#....#..#..#.#.....",
			"..............##.....#.##....##", ".#..##.........###..#..........", "......#......#............#..#.",
			"#.....###...###..........#.....", "...###...........#....##..#....", ".....................#...#.##..",
			"###....#.#....#...#....#.#..##.", "..#.............#.#....#..#.#..", ".......#..###....#...#...#...#.",
			".##..#....##..............##...", "...#...#..#..#.##.#....##...#..", "#..#....##......#....###..####.",
			".##...#.#....#..#..#....#....#.", ".#.##..#..#.........#.#......##", "#..#.................#.....#...",
			"..#............#........#...#..", "##.##.......#.#....#..#....##.#", "..##...#.#.....#......#........",
			"......#.##.........##...#......", "......##.#......#.##....##.#..#", ".#.#......####.#.#.#.#..#......",
			"..#.#....#...###....#.#...###..", ".#.#...#....##..###.#..#.......", "..#.....##..#............#..#.#",
			".#...#....#.....#....#..#.#.#..", "..#....#..#......##...##......#", "....#.......#.##.#.........#..#",
			"#............#...##.....#..##..", "......#..#..........#.#..#.....", "...........#.#..#...##.#...#..#",
			".........###..#......##.###.#..", ".....#....#......#...#....##...", "..#.......#..#.#.#......#......",
			".#....#.....#.#.#.##...#....##.", "....#.##.##.......#..#.....#...", ".#.....#......#.......#..#.....",
			"....###.....##.....##..#.#...#.", "#.......#.#....#.#.#....#......", "#...#..#.#......#...##.#.......",
			"....##.##....#..#.......#..#.#.", ".#.##.#.#..#.....#.#.......##..", "..#..#..#..#.###...............",
			"#.#......##....##.#.#.....#.#..", "..##...#.........#.#..#.##..#..", ".........####...#.....##.#.....",
			"..#...................#.###....", "..#.....#..#....#..#...........", ".....###.#.........#.#.........",
			"#..#..#........#..#......#..#..", "###..##...#.......#........#.#.", ".#.#.#.###.#............##.....",
			"#..............#......#....#.##", ".#...#..###...###.#..#.#.......", ".###....##.#.......#.#.....###.",
			".##.....#.#....................", "#..#.....#.....#...#.....#..##.", "#.#....##..#......##..#...##..#",
			"...........#....#..#.##.##....#", "......#.......##....#.#....#.#.", "###..#.#..........#.......#.#..",
			"..#.#..##....##............##..", "..#.....#..#....###............", ".#...#...##...#..#..#..#.#....#",
			"...#....#........#.............", "#.#......#.#.....##..........#.", "....#..#...............#...##..",
			"........#..#....#..#..#..##....", "....#......#.#.#...#.......#.##", ".#.....#.#.#........###....#...",
			".#..#.......#...........#...#..", "#.#.#####..#......#...#.#.###..", "...##...#.#.....#..#...#...#...",
			"..#....#.....#..#....#.#.....#.", "....#.......#.....#........###.", "..##..........#...###.......#..",
			"#.#.##..#........##...#.#......", "....##...#......#..........#.#.", "#.......#..#.##.............#..",
			"......#..........#...#....#...#", "#.#.....#.##.#.#.............##", "#...#.........##.##......#.##..",
			".........##.....#....#...##..#.", "#.#...##.#...#.....##...#..#..#", "......##.#.....#.#.....#.##....",
			"....#.............#...#.......#", ".#......##...#.#...#.##........", "...#..#..#...........#..#..#.#.",
			".#...#...........#.#.##....#...", "..#...#...#.#..#....#..#..#....", "..###..##..#..#.........#.#..#.",
			"....#.##.#...#.......#...#.....", ".#.#.................#.......#.", ".#..#.....#.##...#.#.....#...#.",
			".#.......#...#....#.......#....", "###....##....#..#...#.#..##....", ".........#.#.#.#...###.......##",
			"....##.......#......#......##..", "......##.###.#..#...#.#.#.#....", ".#.###.#.#......#.#.......##...",
			".#.....##..#.#.....#...#.##....", ".#..##.#.....#........###...#.#", ".......#.#...........#........#",
			"..........#...##..##.......#.#.", "...#..#..#...#....#.#......#.#.", "....#...#..#....#....#.#.##....",
			"...#.#...##...#...##..#........", "..#........#...##.#...##.#.#.#.", "...##.#..#.......###.#.#.#.....",
			"..##......#.#.#.........###.#..", ".......#.#...##...#.#.......#.#", ".#....##..#..#....#..#...#.....",
			".#....#.#.......#..#..##.#....#", "#.#..##..#.#............#....#.", "##..#....#.##.#....#...#..##...",
			".###.#.#..#...##........###.##.", "...........#..#...#..#.#..###..", ".#.#.#...#....#...##.##........",
			".....###.........#......#####..", "#.#.#.....#....#..#...#.#.#.#..", "..##.....#..#..#.#.#...#....#.#",
			"......#.##..##..#.#.#.......#..", "...#.#..###.........#........#.", "......#.##..####...#...#..#...#",
			"#.......#.........#....#....###", "#......#...#........#.##....###", ".#.#..............#...#...###.#",
			".#....####...#..##.###.....#...", ".......#......#..#...#..##.#...", "...........#.......#...........",
			"..............#...#.#.#.#...##.", ".###.....##.#.....#..........#.", "##.##......#....##..#.....###.#",
			"#.......#...##...#....##...#...", "##.#.##...#....#....#....#.....", ".....####...........#.#......#.",
			"......#...#....#..#......#.....", "...#...##..........#.......##.#", ".#....#..........#.####........",
			"...##...#..#...##........##..#.", ".........##....#...##..#.##.#..", "##.#.....#.......#.....#.......",
			"#..#....#.##.#........#........", "#.#...#...##........#.#.....###", "....#...................#.#.#..",
			".......#..#.#...#....#.##.#....", "....##...###.#.#.##...#...#....", ".#....#....#...##.#......#...#.",
			"............##..#.#.#........#.", "...#....#.....#......#........#", "...#.#.....#.##.....#....#...#.",
			".....#..##.......#.##.......#.#", "........##................#....", "....#..###...##.#..#...#......#",
			".#.#.......#.......#....##.#..#", "..#........#............#......", "..##.......#..#..#....#....#..#",
			"#...###.......#.##...#.........", ".....#...#...#..##..#....#..#..", ".##.#..#...##.........###.#....",
			"..#.#..#...#...####.#...#.#.#.#", "#....#..###.....#......#.##..##", "##......#...##...###......#.##.",
			"...........#.....##...#...#...#", "..#..#.#.....#..#.....###...#..", ".............#..........###...#",
			"....##............#....###.##.#", "..##.#..##.....#.#.........#.#.", "....#.#...........####.........",
			".##.###.##.#.#......#.##.#.#...", ".....##.........#..#.......#...", "...........#.........#....###..",
			"...#.#..#..........#.....#..#..", ".#..###.......##........#.#....", ".#...###.....#..#.#..#...#.##..",
			"##...###.#.#....#......#...#..#", "....#.......#..#..##..#.#......", "#.#......#.##..#......#..#....#",
			"....#..#..#.....#.#......#..#..", "..#...###......##.............#", "..#....####...##.#...##.#......",
			".....#.......###...............", ".......#...#.#.......#.#.##.###", ".#.#...#.....#...##.........#..",
			"..#..........#..#.........##...");

	private DayThree() {
	}

	public static Long partOne(List<String> dataSet, int down, int right) {
		Long trees = 0L;
		int slope = right;
		// Lines
		for (int i = down; i < dataSet.size(); i += down) {
			String line = DayThree.trees.get(i);
			if (line.charAt(slope) == '#')
				trees++;
			slope += right;
			if (slope >= line.length())
				slope -= line.length();

		}

		System.out.println(trees);
		return trees;
	}

	public static void partTwo(List<String> dataSet) {
		Long accumulator = 1L;
		accumulator *= partOne(dataSet, 1, 1);
		accumulator *= partOne(dataSet, 1, 3);
		accumulator *= partOne(dataSet, 1, 5);
		accumulator *= partOne(dataSet, 1, 7);
		accumulator *= partOne(dataSet, 2, 1);
		System.out.println(accumulator);
	}
}
