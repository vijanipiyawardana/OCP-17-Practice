import com.postcode.lottery.LotteryDraw;

import java.io.*;

public class Main{
	public static void main(String arg[]) throws IOException{
		String winner;
		LotteryDraw lotteryDraw = new LotteryDraw();
		lotteryDraw.makeWinnerList();
		//lotteryDraw.printWinnerList();

		winner = lotteryDraw.getWinner();
		System.out.println("The winner is : " + winner);
	
		
	}
}
