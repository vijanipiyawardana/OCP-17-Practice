package com.postcode.lottery;

import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class LotteryDraw{

	ArrayList<String> postcodes = new ArrayList<>();

	public String getWinner(){
		Random r = new Random();
		int winnerNumber = r.nextInt(20); // a number 0-19
		System.out.println("Random number is: "+ winnerNumber);
		String winner = postcodes.get(winnerNumber);
		return winner;	
	}

	public void makeWinnerList() throws IOException{
		String file = "/media/vijani/2CB4BCFFB4BCCD18/Vijani_projects/OCP-17-Practice/Hardcoded/JarExample/winners/winners.txt";
		BufferedReader bufReader = new BufferedReader(new FileReader(file));
		String line = bufReader.readLine(); 
		while (line != null) { 
			postcodes.add(line); 
			line = bufReader.readLine(); 
		} 
		bufReader.close();
	}

	public void printWinnerList(){
		for(String postcode: postcodes) {
   			System.out.println(postcode);
		}
	}
}
