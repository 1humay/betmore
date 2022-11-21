package de.uni.koeln.se;

public class BetMore_Game {
	public void picCard(Player player) {
		do { if (player.counter<5) {
				Shuffle x = new Shuffle();
				player.currentCard = x.generateRan();
				player.counter ++; 
				}
			
		}
		while (player.user_selected==false);
		
		
	}

}
