package de.uni.koeln.se;

public class Game_Chair {
	public void start(System player1, Player player2) {
		player1.play();
		player2.play();
	}
	
	public Player findWinner(System player1, Player player2) {
		if (player1.currentCard<player2.currentCard) {return player2;}
		else {return player2;}
	}

}
