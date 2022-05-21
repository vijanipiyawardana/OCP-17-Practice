package main;

import postcode.lottery.LotteryDraw;

import java.io.*;

public class Main{
	public static void main(String arg[]) throws IOException{
		String winner;
		LotteryDraw lotteryDraw = new LotteryDraw();
		lotteryDraw.makeWinnerList();
		//lotteryDraw.printWinnerList();

		winner = lotteryDraw.getWinner();
		System.out.println("The winner is : " + winner);

		winner = lotteryDraw.getWinner();
		System.out.println("The 2nd winner is : " + winner);

		winner = lotteryDraw.getWinner();
		System.out.println("The 3rd winner is : " + winner);
	
		
	}
}
