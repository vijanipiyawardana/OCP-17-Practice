package jar_example.LotteryMain.src.com.postcode.main;

import java.io.*;

import jar_example.LotteryLib.src.com.postcode.draw.LotteryDraw;

public class Main{
	public static void main(String arg[]) throws IOException{
		String winner;
		LotteryDraw lotteryDraw = new LotteryDraw();
		
		winner = lotteryDraw.getWinner();
		System.out.println("The winner is : " + winner);

		winner = lotteryDraw.getWinner();
		System.out.println("The 2nd winner is : " + winner);

		winner = lotteryDraw.getWinner();
		System.out.println("The 3rd winner is : " + winner);
	
		
	}
}
