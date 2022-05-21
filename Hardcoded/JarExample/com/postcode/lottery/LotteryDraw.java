package postcode.lottery;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class LotteryDraw{

	ArrayList<String> postcodes = new ArrayList<>();
	List<Integer> generatedRandomNumbers = new ArrayList<>();
	
	public String getWinner(){
		String winner = null;
		Random r = new Random();
	
		int winnerNumber;
		winnerNumber = r.nextInt(postcodes.size()); 
		System.out.println("Random number is: "+ winnerNumber);
		generatedRandomNumbers.add(winnerNumber);
		
		do{
			winner = postcodes.get(winnerNumber);
			if(winner != null){
				break;
			}
			else{
				winnerNumber = r.nextInt(postcodes.size());
			}
		}while(!generatedRandomNumbers.contains(winnerNumber));
		
		for(int num: generatedRandomNumbers) {
   			System.out.print(num + " ");
		}
		System.out.println();
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
