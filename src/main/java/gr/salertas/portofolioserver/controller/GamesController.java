package gr.salertas.portofolioserver.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.salertas.portofolioserver.service.GamesService;

@RestController
@RequestMapping("games")
public class GamesController {

	@Autowired
	private GamesService gamesService;

	@GetMapping("match-match/cardnames")
	public ArrayList<String> getMatchMatchCardNames() {
		return gamesService.getCardNames(9);
	}

}
