package de.uni.koeln.se;

public class Player {
	public int currentCard;
	public int counter;
	public boolean user_selected;

	
	public void play() {
		BetMore_Game game = new BetMore_Game();
		game.picCard(this);
	}
	
	
	
	

}
