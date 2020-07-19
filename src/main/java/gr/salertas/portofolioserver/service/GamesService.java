package gr.salertas.portofolioserver.service;

import java.util.ArrayList;

public interface GamesService {

	// Returns an array of random card names from the collection
	public ArrayList<String> getCardNames(int numberOfCards);

}
