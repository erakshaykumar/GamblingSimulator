package com.bridgelabz.gamblingsimulator;

public class Gambling {
	static int stake = 100 ;		 // Total Stake Value = $100

	public static void checkWinner() {
		System.out.println("Welcome To Gambling Simulator");

		System.out.println("Gambler start with stake of $" + stake);
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
		checkWinner();
	}
}
