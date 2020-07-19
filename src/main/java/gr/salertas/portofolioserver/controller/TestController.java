package gr.salertas.portofolioserver.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

	@GetMapping("/")
	String homePage() {
		return "Hello heroku!";
	}

}
