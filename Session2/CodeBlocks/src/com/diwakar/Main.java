package com.diwakar;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if(score == 5000) {
			System.out.println("Your score was 5000");
		}else if(score<5000){
			System.out.println("Your score is less then 5000");
		}
		else{
			System.out.println("Got here");
		}
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was "+finalScore);
		}

    }
}
