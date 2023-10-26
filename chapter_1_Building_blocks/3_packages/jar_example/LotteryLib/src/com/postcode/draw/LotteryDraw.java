package jar_example.LotteryLib.src.com.postcode.draw;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class LotteryDraw{

	private List<String> postcodes;
	private List<String> selectedPostcodes;

	public LotteryDraw(){
		postcodes = new ArrayList<>();
		selectedPostcodes = new ArrayList<>();
		try{
			makeWinnerList();
		}catch(IOException ex){
			System.err.println(ex.getMessage());
		}
	}
	
	public String getWinner(){
		Random r = new Random();
	
		int winnerNumber = r.nextInt(postcodes.size()); 
		System.out.println("Postcodes size :" + postcodes.size());
		System.out.println("Random number is: "+ winnerNumber);
		String winner = postcodes.get(winnerNumber);
		
		while(selectedPostcodes.contains(winner)){
			winnerNumber = r.nextInt(postcodes.size());
			winner = postcodes.get(winnerNumber); 
		}
		selectedPostcodes.add(winner);
		return winner;
	}

	public void makeWinnerList() throws IOException{
		String file = "./jar_example/postcodes.txt";
		BufferedReader bufReader = new BufferedReader(new FileReader(file));
		String line = null; 
		while ((line = bufReader.readLine()) != null) { 
			postcodes.add(line); 
		} 
		bufReader.close();
	}

	public void printWinnerList(){
		for(String postcode: postcodes) {
   			System.out.println(postcode);
		}
	}
}
