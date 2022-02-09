package com.bridgelabz.gamblingsimulator;

public class GamblingSimulator {
	static int stake = 100 ;	// Total Stake Value = $100
	static int bet = 1;
	public static void checkWinner() {
			
		int TRIAL = (int) Math.floor(Math.random() * 2);
		System.out.println("Value Is " +TRIAL);
		if (TRIAL == 0) {   
			System.out.println("Gambler won the game");
			stake++; 	//Increment
		} else {
			System.out.println("Gambler loose the game");
			stake--;	//Decrement
		}
		System.out.println("Gambler having stake after bet are of $ " + stake);
	}
	public static void main(String[] args) {
		System.out.println("Welcome To Gambling Simulator");
		checkWinner();
	}
}